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
    @FXML
    private Notebook notebook;
    @FXML
    private TextField titleField;
    @FXML
    private TextArea contentArea;
    @FXML
    private TextArea resultArea;

    @FXML
    private Button addButton;


    @FXML
    private void handleAddButtonAction(ActionEvent event) {
        String title = titleField.getText();
        String content = contentArea.getText();
        Note note = new Note(title, content);

        notebook.addNote(note);
        titleField.clear();
        contentArea.clear();

        // Update the resultArea with the content of all notes
        String allNotesContent = notebook.printContent();
        resultArea.setText(allNotesContent);
    }
}