package controller;
import model.Dictionary;
import view.DictionaryView;


public class DictionaryController {
    private Dictionary dictionary;
    private DictionaryView dictionaryView;

    public static void main(String[] args) {
        Dictionary dictionary1 = new Dictionary();
        dictionary1.addToDictionary("Apple", "A fruit");
        dictionary1.addToDictionary("Banana", "A yellow fruit");
        dictionary1.addToDictionary("Cat", "A pet animal");

        DictionaryView.launch(DictionaryView.class);
    }
}
