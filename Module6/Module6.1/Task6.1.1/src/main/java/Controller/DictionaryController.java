package Controller;

import Model.Dictionary;

public class DictionaryController extends Dictionary {
    private Dictionary model;

    public DictionaryController(Dictionary model) {
        this.model = model;
    }

    public String searchFromDictionary(String key){
        return model.searchFromDictionary(key);
    }
}
