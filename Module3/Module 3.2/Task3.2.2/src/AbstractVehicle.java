abstract class AbstractVehicle implements Vehicle{
    private String type;
    private String color;
    private String fuel;


    public AbstractVehicle(String model, String fuel, String color){
        this.type = model;
        this.fuel = fuel;
        this.color = color;

    }
    public String getType(){
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getFuel() {
        return fuel;
    }

    abstract void honk();
}

