package model;

import java.util.HashMap;
import java.util.Map;

public class Converter {
    private static final Map<String, Currency> currencies = new HashMap<>();

    static {
        currencies.put("USD", new Currency("USD", "United States Dollar", 1.0));
        currencies.put("EUR", new Currency("EUR", "Euro", 0.92));
        currencies.put("SEK", new Currency("SEK", "Swedish Krona", 10.30));

    }

    public static Map<String, Currency> getCurrencies() {
        return currencies;
    }

    public static class Currency {
        private final String abbreviation;
        private final String name;
        private final double conversionRateToUSD;

        public Currency(String abbreviation, String name, double conversionRateToUSD) {
            this.abbreviation = abbreviation;
            this.name = name;
            this.conversionRateToUSD = conversionRateToUSD;
        }

        public String getAbbreviation() {
            return abbreviation;
        }

        public String getName() {
            return name;
        }

        public double getConversionRateToUSD() {
            return conversionRateToUSD;
        }
    }
}