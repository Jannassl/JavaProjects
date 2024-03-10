
DROP DATABASE IF EXISTS currency_db;


CREATE DATABASE currency_db;

-- Use the created database
USE currency_db;

-- Create a table for storing the Currency objects
CREATE TABLE Currencies (
    id INT AUTO_INCREMENT,
    abbreviation VARCHAR(3),
    name VARCHAR(50),
    conversion_rate DECIMAL(10, 4),
    PRIMARY KEY (id)
);

-- Populate the table with data
INSERT INTO Currencies (abbreviation, name, conversion_rate) VALUES
('USD', 'United States Dollar', 1.0000),
('EUR', 'Euro', 0.8817),
('JPY', 'Japanese Yen', 114.9300),
('GBP', 'British Pound', 0.7556),
('AUD', 'Australian Dollar', 1.3622),
('CAD', 'Canadian Dollar', 1.2758),
('CHF', 'Swiss Franc', 0.9246),
('CNY', 'Chinese Yuan', 6.3921);

-- Drop the user account appuser, if it exists
DROP USER IF EXISTS 'appuser'@'localhost';

-- Create the user account appuser
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'password';

-- Grant the privileges to the user account appuser
GRANT SELECT, INSERT, UPDATE, DELETE ON currency_db.* TO 'appuser'@'localhost';