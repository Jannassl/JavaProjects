package view;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import model.Dictionary;

public class DictionaryView extends Application{
    private Dictionary dictionary;
    // Make a method to read user input and search for that word in dictionary
    public void start(Stage stage) {
        FlowPane rootNode = new FlowPane();
        Scene scene = new Scene(rootNode, 300, 200);
        stage.setScene(scene);
        TextField word = new TextField("Enter word to search: ");
        Button button = new Button("Search");
        TextArea result = new TextArea();
        rootNode.getChildren().addAll(word, button,result);
        stage.show();
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println();
            }
        });
    }
}
