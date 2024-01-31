public class Motorcycle implements Vehicle{
    private String status;
    private String type;
    private String color;
    private String fuel;

    public Motorcycle(String type, String fuel, String color){
        this.type = type;
        this.fuel = fuel;
        this.color = color;

    }
    @Override
    public void start(){
        System.out.println("Motorcycle is starting..");
    }
    @Override
    public void stop() {

        System.out.println("Motorcycle is turning off...");
    }
    @Override
    public void getInfo() {
        System.out.println("Type: "+ getType());
        System.out.println("fuel: "+ getFuel());
        System.out.println("color: "+ getColor());


    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getFuel() {
        return fuel;
    }
}
