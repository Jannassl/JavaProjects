import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna 1. numero: ");
        double a = scanner.nextDouble();

        System.out.print("Anna 2. numero: ");
        double b = scanner.nextDouble();

        System.out.print("Anna 3. numero: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;


        if (discriminant >= 0) {

            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else {

            System.out.println("No real roots");
        }

        scanner.close();
    }
}
