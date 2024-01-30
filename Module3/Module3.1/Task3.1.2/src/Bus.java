public class Bus extends Car{
    private int passengers;
    private int speed;
    private float gasolineLevel;

    public Bus(String typeName,float tankCapacity,float topSpeed,int passengers){
        super(typeName,tankCapacity,topSpeed);
        this.passengers = passengers;
        speed = 0; gasolineLevel = 0;
    }
    public int passengerEnter(){
        passengers += 1;
        return passengers;
    }
    public int passengerExit(){
        passengers -= 1;
        return passengers;
    }
}
