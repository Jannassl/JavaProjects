package dao;
import java.util.*;

import Entity.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;


public class ConverterDao {
    List<Converter> converterList = new ArrayList<>();

    public void persist(Converter emp) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
    }

    public Converter find(int id) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        Converter conv = em.find(Converter.class, id);
        return conv;
    }

    public void update(Converter conv) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.merge(conv);
        em.getTransaction().commit();
    }

    public void delete(Converter conv) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.remove(conv);
        em.getTransaction().commit();
    }

    public List<String> findAllAbbreviations() {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();

        // Create a query to retrieve all data from the abbreviation column
        Query query = em.createQuery("SELECT c.abbreviation FROM Converter c");

        // Execute the query and get the result
        List<String> abbreviations = query.getResultList();

        return abbreviations;
    }

    public double getCurrency(String name) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();

        // Create a query to retrieve the conversion rate of the given currency
        Query query = em.createQuery("SELECT c.conversion_rate FROM Converter c WHERE c.abbreviation = :name");
        query.setParameter("name", name);

        // Execute the query and get the result
        double conversionRate;
        try {
            conversionRate = (double) query.getSingleResult();
        } catch (NoResultException e) {
            conversionRate = 0.0;
        }

        return conversionRate;
    }
}
