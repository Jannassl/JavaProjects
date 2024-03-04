package view;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class NotebookView extends Application{

    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("src/main/resources/fxml.fxml"));
        Parent root = fxmlLoader.load();

        stage.setScene(new Scene(root));
        stage.show();
    }


}
