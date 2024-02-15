public class StringManipulator {
    public String concatenate(String word1, String word2) {
        return word1 + word2;
    }
    public int findLength(String word) {
        return word.length();
    }
    public String convertToUpperCase(String word) {
        return word.toUpperCase();
    }
    public String convertToLowerCase(String word){
        return word.toLowerCase();
    }
    public boolean containsSubString(String word, String subStr){
        if(word.contains(subStr)){
            return true;

        }else {
            return false;
        }
    }

}
