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

# **Inheritance**

# **Polymorphism**
Polymorphism refers a single function, method, or operator work with multiple types of data. For example, we have parent abstract class Animal
and 1,000 child animal classes such as Cat, Dog, etc. We want to implement the method to print sound of the animal. 
If we don't use method overriding, we will have 1,000 different methods to print sounds, and it will be difficult 
to remember at some points. Therefore, we can simply declare abstract method in parent, and override in child class 
to simply it. 

```
package polymorphism;

abstract class Animal {
    abstract void sound(); 

}
```
```
public class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("Mow!");
    }
}

public class Dog extends Animal {
    @Override 
    public void sound() {
        System.out.println("Bark!"); 
    }
}
```
# **Abstraction**
Abstraction is to design the simple declaration in parent level class and complex implementation will be implemented
in the child class. This increase the readability and reuseability of the code. For example, Creature has only abstract method
and the method body will be implemented in the child classes such as Human and Animal. 

```
package abstraction;

public abstract class Creature {
    
    public abstract void attack(); 
    public abstract void printInfo(); 

}
```
```
package abstraction;

public class Human extends Creature {
    @Override
    public void attack() {
        System.out.println("Human attacked");
    }   

    @Override 
    public void printInfo() {
        System.out.println("This is human"); 
    }
}

package abstraction;

public class Animal extends Creature {
    @Override
    public void attack() {
        System.out.println("Animal Attacked");
    }   

    @Override 
    public void printInfo() {
        System.out.println("This is animal"); 
    }
}

```
