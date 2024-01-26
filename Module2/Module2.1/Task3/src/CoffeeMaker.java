import java.util.Scanner;

public class CoffeeMaker {
    Scanner scanner = new Scanner(System.in);
    private boolean status;
    private String type;
    private int amount;


    public CoffeeMaker(){
        status = false;
        type = "normal";
        amount = 30; // vakio
    }
    public void powerOn(){
        status = true;
        System.out.println("Kahvinkeitin on nyt päällä.");
    }
    public void info(){
        System.out.println("Kahvin tyyppi: "+ type);
        System.out.println("Määrä " + amount+" ml");
    }
    public void powerOff(){
        status = false;
        System.out.println("Kahvinkeitin on nyt pois päältä.");
    }
    public void selectType(){
        if(status) {
            System.out.println("Valitse normaali tai espresso (1/2)");
            int kahviValinta = scanner.nextInt();
            if(kahviValinta == 1){
                type = "normal";
            }
            if(kahviValinta == 2){
                type = "espresso";
            }
        }else {
            System.out.println("Kytke kahvinkeitin päälle");
        }
        //System.out.println("Valitsit "+type+ " kahvin.");

    }
    public void setAmount(){
        if(status){
            System.out.println("Syötä määrä (10-80 ml.");
            int desiredAmount = scanner.nextInt();

            if(desiredAmount >9 && desiredAmount <81){
                amount = desiredAmount;
            }else {
                System.out.println("Väärä määrä");
            }
            System.out.println("Valitsit "+type+ " kahvin.");
            System.out.println("Määrä: "+amount+ " ml.");
        }
    }
}

