SELECT * FROM currencies;

SELECT * FROM currencies WHERE NAME ="Euro";

SELECT COUNT(*) FROM currencies;

SELECT * FROM Currencies WHERE conversion_rate = (SELECT MAX(conversion_rate) FROM currencies);

