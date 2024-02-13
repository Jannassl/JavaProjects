import java.util.Scanner;

public class FarenheitToCelsius {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Syötä fahrenheit asteet: ");
        double temp = Double.parseDouble(reader.nextLine());
        double cels = (temp - 32) * 5/9;

        System.out.printf("Celsius asteina: %.2f\n", cels);
    }

}
