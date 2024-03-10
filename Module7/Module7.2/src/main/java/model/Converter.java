package model;

import java.util.HashMap;
import java.util.Map;

public class Converter {
    private String abbreviation, name;
    private double Conversion_rate;

    public Converter(String abbreviation, String name, double Conversion_rate) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.Conversion_rate = Conversion_rate;
    }
    //setter and getter methods
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
        return Conversion_rate;
    }

public void setConversion_rate(double Conversion_rate) {
        this.Conversion_rate = Conversion_rate;
    }
}