public class SportsCar extends Car{
    private float speed;
    private double gasolineLevel;
    private boolean cruiseControlOn;
    private int targetSpeed;

    public SportsCar(String typeName, float tankCapacity, float topSpeed) {
        super(typeName, tankCapacity, topSpeed);

    }
    public void accelerate() {
        if (gasolineLevel > 0) {
            if (cruiseControlOn) {
                gasolineLevel -= 10;
                speed = Math.min(speed + 20, targetSpeed);
            } else {
                gasolineLevel -= 10;
                speed += 20;
            }
        } else {
            speed = 0;
        }
    }
    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0) {
                speed = Math.max(0, speed - amount);
            }
        } else {
            speed = 0;
        }
    }
}