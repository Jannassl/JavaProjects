package controller;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import model.Converter;
import view.ConverterView;

public class ConverterController {
    public static void convertCurrency(String sourceCurrency, String targetCurrency, String amount, TextField resultField) {
        if (sourceCurrency == null || targetCurrency == null || amount == null || resultField == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid input. Please make sure all fields are filled.", ButtonType.OK);
            alert.showAndWait();
            return;
        }

        if (!Converter.getCurrencies().containsKey(sourceCurrency) || !Converter.getCurrencies().containsKey(targetCurrency)) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid currency. Please select a valid currency.", ButtonType.OK);
            alert.showAndWait();
            return;
        }

        double sourceRate = Converter.getCurrencies().get(sourceCurrency).getConversionRateToUSD();
        double targetRate = Converter.getCurrencies().get(targetCurrency).getConversionRateToUSD();

        double amountInUSD;
        try {
            amountInUSD = Double.parseDouble(amount) * sourceRate;
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid amount. Please enter a valid number.", ButtonType.OK);
            alert.showAndWait();
            return;
        }

        double convertedAmount = amountInUSD / targetRate;
        resultField.setText(String.valueOf(convertedAmount));
    }

    public static void main(String[] args) {
        ConverterView.launch(ConverterView.class);
    }
}