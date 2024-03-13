package controller;

import dao.ConverterDao;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import view.ConverterView;

public class ConverterController {
    public double convertCurrency(String sourceCurrency, String targetCurrency, double amount) {
        ConverterDao converterDao = new ConverterDao();

        if (sourceCurrency == null || targetCurrency == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid input. Please make sure all fields are filled.", ButtonType.OK);
            alert.showAndWait();
            return 0.0;
        }

        double sourceRate = converterDao.getCurrency(sourceCurrency);
        double targetRate = converterDao.getCurrency(targetCurrency);

        if (sourceRate == 0.0 || targetRate == 0.0) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid currency. Please select a valid currency.", ButtonType.OK);
            alert.showAndWait();
            return 0.0;
        }

        double amountInUSD = amount * sourceRate;
        double convertedAmount = amountInUSD / targetRate;
        return convertedAmount;
    }


    public static void main(String[] args) {
        ConverterView.launch(ConverterView.class);
    }

}