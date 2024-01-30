import java.util.Scanner;
public class CarDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car("Subaru", 60,180);
        SportsCar sportsCar = new SportsCar("BMW",60,260);




        boolean exit = false;

        while (!exit) {
            System.out.println("Car Menu:");
            System.out.println("1. Accelerate");
            System.out.println("2. Decelerate");
            System.out.println("3. Fill Tank");
            System.out.println("4. Enable Cruise Control");
            System.out.println("5. Disable Cruise Control");
            System.out.println("6. Set Target Speed");
            System.out.println("7. Display Car Status");
            System.out.println("8. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    car.accelerate();
                    System.out.println("Car accelerated.");
                    break;
                case 2:
                    System.out.print("Enter deceleration amount: ");
                    int deceleration = scanner.nextInt();
                    car.decelerate(deceleration);
                    System.out.println("Car decelerated.");
                    break;
                case 3:
                    car.fillTank();
                    System.out.println("Tank filled.");
                    break;
                case 4:
                    car.enableCruiseControl();
                    System.out.println("Cruise control enabled.");
                    break;
                case 5:
                    car.disableCruiseControl();
                    System.out.println("Cruise control disabled.");
                    break;
                case 6:
                    System.out.print("Enter target speed: ");
                    float targetSpeed = scanner.nextFloat();
                    car.setTargetSpeed(targetSpeed);
                    System.out.println("Target speed set to " + targetSpeed);
                    break;
                case 7:
                    Car.displayCarStatus(car);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please select again.");
            }
        }
    }
}