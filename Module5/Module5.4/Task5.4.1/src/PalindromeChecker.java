public class PalindromeChecker {
    public boolean isPalindrome(String word){
        String pieneksi = word.replaceAll("\\W", "").toLowerCase();
        int alku = 0;
        int loppu = pieneksi.length()-1;
        while(alku < loppu){
            if(pieneksi.charAt(alku) != pieneksi.charAt(loppu)){
                return false;
            }
            alku++;
            loppu--;
        }
        return true;
    }
}
