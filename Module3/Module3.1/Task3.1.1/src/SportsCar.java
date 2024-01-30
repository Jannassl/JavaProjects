public class SportsCar {
    private float speed;
    private boolean cruiseControlOn;
    private float targetSpeed;
    private float gasolineLevel;
    private String typeName;
    private float tankCapacity;
    private float topSpeed;

    public SportsCar(String typeName) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
    }
    public SportsCar(String typeName,float tankCapacity,float topSpeed){
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;
        this.cruiseControlOn = false;
        this.targetSpeed = 0;

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
    float getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    float getGasolineLevel() {
        return gasolineLevel;
    }
    public void enableCruiseControl() {
        cruiseControlOn = true;
    }

    public void disableCruiseControl() {
        cruiseControlOn = false;
    }

    public void setTargetSpeed(float speed) {
        if (cruiseControlOn) {
            targetSpeed = Math.min(speed, getSpeed());
        }
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }

    public float getTargetSpeed() {
        return targetSpeed;
    }
    public static void displayCarStatus(Car car) {
        System.out.println("Car Status:");
        System.out.println("Type: " + car.getTypeName());
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Gasoline Level: " + car.getGasolineLevel());
        System.out.println("Cruise Control: " + (car.isCruiseControlOn() ? "Enabled" : "Disabled"));
        System.out.println("Target Speed: " + car.getTargetSpeed());
    }
}

