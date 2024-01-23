
public class CoffeeMaker {
    private boolean status;
    private String type;
    private int amount;


    public CoffeeMaker(){
        status = false;
        type = "Normal";
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
    public void selectType(String value){
        if(status) {
            type = value;
            System.out.println("Valitsit: "+type+" kahvin.");
        }else {
            System.out.println("Kytke kahvinkeitin päälle");
        }

    }
    public void setAmount(int desiredAmount){
        if(status){
            if(desiredAmount >9 && desiredAmount <81){
                amount = desiredAmount;
            }else {
                System.out.println("Väärä määrä");
            }
        }
    }
}

