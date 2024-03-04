package model;
import java.util.HashMap;



public class Notebook {
    private HashMap<String, String> notes = new HashMap<String, String>();

    public void addNote(Note note) {
        notes.put(note.getTitle(), note.getContent());
    }

    public String printContent() {
        String content = "";
        for (String key : notes.keySet()) {
            content += "Title: " + key + "\nContent: " + notes.get(key) + "\n\n";
        }
        return content;
    }

    public void removeNoteByTitle(String title) {
        notes.remove(title);
    }

    public void clear() {
        notes.clear();
    }


}
