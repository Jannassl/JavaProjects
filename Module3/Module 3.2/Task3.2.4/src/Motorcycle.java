public class Motorcycle extends AbstractVehicle{
    private String status;
    private String type;
    private String color;
    private String fuel;

    public Motorcycle(String type, String fuel, String color, double efficiency){
        super(type, fuel, color, efficiency);

    }
    @Override
    public void start(){
        System.out.println("Motorcycle is starting..");
    }

    @Override
    void displayEfficiency(){
        System.out.println(getEfficiency()+"l/ 100km");
    }
    @Override
    public void stop() {

        System.out.println("Motorcycle is turning off...");
    }

    @Override
    void honk(){
        System.out.println("Beep Beep!!");
    }
    void accelerate(){
        System.out.println(type+" has accelerated");
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
