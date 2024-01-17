import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        String binary = scanner.nextLine();

        int decimal = 0;
        for (int i = binary.length()-1, j=0; i >= 0; i--, j++) {
            char bit = binary.charAt(i);
            int bitValue = Character.getNumericValue(bit);
            decimal += bitValue * Math.pow(2, j);
        }
        System.out.println("in decimals: " + decimal);
    }

}
