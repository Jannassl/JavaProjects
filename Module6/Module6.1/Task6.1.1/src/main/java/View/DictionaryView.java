package View;
import Controller.DictionaryController;
import Model.Dictionary;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application{
    private DictionaryController controller;
    public void start(Stage window){
        Label searchBar = new Label("Search bar");
        Button button = new Button("Search");
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(searchBar);
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {


            }
        });

    }
}