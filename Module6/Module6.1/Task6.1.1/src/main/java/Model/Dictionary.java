package Model;
import java.util.HashMap;
import java.util.Map;
public class Dictionary {
    public Map<String, String> dictionary = new HashMap<>();
    void addToDictionary(String key, String value){
        dictionary.put(key, value);
    }
    public String searchFromDictionary(String key){
        if(dictionary.containsKey(key)){
            return key;
        }else {
            return "Not found";
        }
    }
}

