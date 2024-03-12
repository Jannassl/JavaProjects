package Entity;

import jakarta.persistence.*;

@Entity

public class Transaction {
    @Id
    private int id;
    private String abbreviation;
    private String name;
    private double conversion_rate;

    public Transaction(String abbreviation, String name, double conversion_rate){
        this.abbreviation = abbreviation;
        this.name = name;
        this.conversion_rate = conversion_rate;
    }
    public Transaction(){

    }
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }
}
