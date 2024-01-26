import java.util.Scanner;
public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        while(true){
            System.out.println("1.Kytke virta/ 2.sammuta/ 3.Kahvin tyyppi ja määrä");
            System.out.print("Valitse vaihtoehto: ");
            int valinta = scanner.nextInt();

            switch(valinta) {
                case 1:
                    coffeeMaker.powerOn();
                    break;
                case 2:
                    coffeeMaker.powerOff();
                    break;
                case 3:
                    coffeeMaker.selectType();
                    coffeeMaker.setAmount();
                    break;

            }

        }

    }


}
