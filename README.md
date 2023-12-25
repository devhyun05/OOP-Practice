This repository is for understanding the concept of object oriented programming 

# **Encapsulation** 
Encapsulation is to hide important data with the private keyword, and only can be accessed by some specific methods. 
For example, let's think about self-driving car, and it only has one property speed. From a design perspective, it is 
dangerous if the developer can directly access to the speed property at some points. It can cause the car accident 
Therefore, we use the encapsulation to hide the speed with private keyword, and only can accessible through specific methods 
with proper validation code. 

```
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

```

**Inheritance**

**Polymorphism**

**Abstraction**

