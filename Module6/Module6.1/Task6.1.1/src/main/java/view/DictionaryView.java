package view;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application{
    // Make a method to read user input and search for that word in dictionary
    public void start(Stage stage) {
        FlowPane rootNode = new FlowPane();
        Scene scene = new Scene(rootNode, 300, 200);
        stage.setScene(scene);
        Label label = new Label("Enter word to search: ");
        Button button = new Button("Search");
        rootNode.getChildren().addAll(label, button);
        stage.show();
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Search button clicked");
            }
        });
    }
}
