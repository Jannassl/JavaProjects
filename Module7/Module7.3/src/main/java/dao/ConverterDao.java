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
        try {
            em.getTransaction().begin();
            em.persist(emp);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println("Error persisting Converter: " + e.getMessage());
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }
    }

    public Converter find(int id) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        Converter conv = null;
        try {
            conv = em.find(Converter.class, id);
        } catch (Exception e) {
            System.err.println("Error finding Converter: " + e.getMessage());
        }
        return conv;
    }

    public void update(Converter conv) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        try {
            em.getTransaction().begin();
            em.merge(conv);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println("Error updating Converter: " + e.getMessage());
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }
    }

    public void delete(Converter conv) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        try {
            em.getTransaction().begin();
            em.remove(conv);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println("Error deleting Converter: " + e.getMessage());
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }
    }

    public List<String> findAllAbbreviations() {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        List<String> abbreviations = null;
        try {
            Query query = em.createQuery("SELECT c.abbreviation FROM Converter c");
            abbreviations = query.getResultList();
        } catch (Exception e) {
            System.err.println("Error finding all abbreviations: " + e.getMessage());
        }
        return abbreviations;
    }

    public double getCurrency(String name) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        double conversionRate = 0.0;
        try {
            Query query = em.createQuery("SELECT c.conversion_rate FROM Converter c WHERE c.abbreviation = :name");
            query.setParameter("name", name);
            conversionRate = (double) query.getSingleResult();
        } catch (Exception e) {
            System.err.println("Error getting currency: " + e.getMessage());
        }
        return conversionRate;
    }
}
