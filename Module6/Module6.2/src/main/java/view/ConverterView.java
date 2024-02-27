package view;
import com.sun.javafx.scene.control.InputField;
import controller.ConverterController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import org.w3c.dom.Text;

public class ConverterView extends Application{

    public void start(Stage window) throws Exception {
        FlowPane layout = new FlowPane();
        TextField currencyField = new TextField("Input currency to convert");
        TextField resultField = new TextField("Result");


        Button convertButton = new Button("Convert");
        ComboBox sourceBox = new ComboBox<>();
        sourceBox.getItems().addAll(
                "USD",
                "EUR",
                "SEK"
        );
        ComboBox targetBox = new ComboBox<>();
        targetBox.getItems().addAll(
                "USD",
                "EUR",
                "SEK"
        );



        layout.getChildren().add(currencyField);
        layout.getChildren().add(sourceBox);
        layout.getChildren().add(resultField);
        layout.getChildren().add(targetBox);
        layout.getChildren().add(convertButton);


        Scene view = new Scene(layout);
        window.setTitle("Currency converter");
        window.setScene(view);
        window.show();

    }
}
