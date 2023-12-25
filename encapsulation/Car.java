package encapsulation;

public class Car {
    private static final double MAX_SPEED = 200.0; 

    private double speed; 

    public Car() {}

    public Car(double speed) {
        this.speed = speed; 
    }

    public void setSpeed(double speed) {
        if (speed > MAX_SPEED) {
            System.err.println("Error: Speed cannot exceed the max speed"); 
        } else {
            this.speed = speed; 
        }
    }

    public Double getSpeed() {
        return this.speed; 
    }

    @Override
    public String toString() {
        return "Car speed: " + this.speed ;
    }
}
