package view;

import controller.ConverterController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import model.Converter;

public class ConverterView extends Application{

    public void start(Stage window) throws Exception {
        FlowPane layout = new FlowPane();
        TextField currencyField = new TextField("Input currency to convert");
        TextField resultField = new TextField("Result");

        Button convertButton = new Button("Convert");
        ComboBox<String> sourceBox = new ComboBox<>();
        ComboBox<String> targetBox = new ComboBox<>();

        Converter.getCurrencies().forEach((abbreviation, currency) -> {
            sourceBox.getItems().add(abbreviation);
            targetBox.getItems().add(abbreviation);
        });



        layout.getChildren().add(currencyField);
        layout.getChildren().add(sourceBox);
        layout.getChildren().add(resultField);
        layout.getChildren().add(targetBox);
        layout.getChildren().add(convertButton);
        convertButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ConverterController.convertCurrency(sourceBox.getValue(), targetBox.getValue(), currencyField.getText(), resultField);
            }
        });


        Scene view = new Scene(layout,650,100);
        view.getStylesheets().add("style.css");
        window.setTitle("Currency converter");
        window.setScene(view);
        window.show();

    }
}
