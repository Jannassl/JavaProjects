package view;

import Entity.Converter;
import controller.ConverterController;
import dao.ConverterDao;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.List;


public class ConverterView extends Application{

    public void start(Stage window) throws Exception {

        FlowPane layout = new FlowPane();
        TextField currencyField = new TextField("Input currency to convert");
        TextField resultField = new TextField("Result");

        Button convertButton = new Button("Convert");
        Button addButton = new Button("Add currency");
        ComboBox<String> sourceBox = new ComboBox<>();
        ComboBox<String> targetBox = new ComboBox<>();
        ConverterDao converterDao = new ConverterDao();
        List<String> abbreviations = converterDao.findAllAbbreviations();
        sourceBox.getItems().addAll(abbreviations);
        targetBox.getItems().addAll(abbreviations);


        layout.getChildren().add(currencyField);
        layout.getChildren().add(sourceBox);
        layout.getChildren().add(resultField);
        layout.getChildren().add(targetBox);
        layout.getChildren().add(convertButton);
        layout.getChildren().add(addButton);
        convertButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ConverterController.convertCurrency(sourceBox.getValue(), targetBox.getValue(), currencyField.getText(), resultField);
            }
        });
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage newStage = new Stage();
                FlowPane layout = new FlowPane();
                TextField abbreviationField = new TextField("Input abbreviation");
                TextField nameField = new TextField("Input name");
                TextField conversionRateField = new TextField("Input conversion rate");
                Button submitButton = new Button("Submit");
                layout.getChildren().addAll(abbreviationField, nameField, conversionRateField, submitButton);
                submitButton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        String abbreviation = abbreviationField.getText();
                        String name = nameField.getText();
                        double conversionRate = Double.parseDouble(conversionRateField.getText());

                        Converter newConverter = new Converter(abbreviation, name, conversionRate);
                        converterDao.persist(newConverter);
                    }
                });
                Scene view = new Scene(layout,550,100);
                view.getStylesheets().add("style.css");
                newStage.setTitle("Add Currency");
                newStage.setScene(view);
                newStage.showAndWait();
            }
        });


        Scene view = new Scene(layout,650,100);
        view.getStylesheets().add("style.css");
        window.setTitle("Currency converter");
        window.setScene(view);
        window.show();

    }
}
