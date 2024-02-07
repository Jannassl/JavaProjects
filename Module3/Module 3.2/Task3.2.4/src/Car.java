public class Car extends AbstractVehicle {

    private String type;
    private String color;
    private String fuel;

    public Car(String type, String fuel, String color, double effficiency){
        super(type, fuel, color, effficiency);

    }
    @Override
    public void start(){
        System.out.println("Car is starting..");
    }
    @Override
    public void stop() {

        System.out.println("Car is turning off...");
    }

    @Override
    void honk(){
        System.out.println("Beep Beep!!");
    }

    @Override
    void displayEfficiency(){
        System.out.println(CalculateEfficiency() +"l/ 100km");
    }

    public String getColor() {
        return color;
    }

    public String getFuel() {
        return fuel;
    }
    @Override
    public double CalculateEfficiency() {
        return efficiency;
    }

}
