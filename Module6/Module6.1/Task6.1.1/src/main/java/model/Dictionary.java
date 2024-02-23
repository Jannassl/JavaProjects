package model;
import java.util.HashMap;


public class Dictionary {
    private HashMap<String , String> dictionary = new HashMap<>();

    public void addToDictionary(String word, String meaning){
        dictionary.put(word, meaning);
    }
    void searchInDictionary(String word){
        if(dictionary.containsKey(word)){
            System.out.println("Meaning of " + word + " is " + dictionary.get(word));
        }
        else{
            System.out.println("Word not found in dictionary");
        }
    }
}
