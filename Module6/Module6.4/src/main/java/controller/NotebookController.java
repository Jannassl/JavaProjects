package controller;
import model.Notebook;
import model.Note;
import view.NotebookView;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;



public class NotebookController {
    private Notebook notebook;
    @FXML
    private TextField titleField;
    @FXML
    private TextArea contentArea;
    @FXML
    private Button addButton;
    @FXML
    private ListView<String> noteList;
    @FXML
    private void handleAddButtonAction(ActionEvent event) {
        String title = titleField.getText();
        String content = contentArea.getText();
        Note note = new Note(title, content);

        notebook.addNote(note);
        noteList.getItems().add(title);
        titleField.clear();
        contentArea.clear();
    }

    public static void main(String[] args) {
        NotebookView.launch(NotebookView.class);
    }
}
