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
Inheritance is to inherit some repeated properties and behaviors from the parent class to child classes to increase code reuseability and efficiency.
Also, it can use protected keyword to only send some elements to child classes which increase the security of the system. The relationship between 
parent class, child class become more strong, and it results clear top-to-bottom hierarchy.

```
package inheritance;

public abstract class Animal {
    protected String name; 
    protected int age; 

    public Animal(String name, int age) {
        this.name = name; 
        this.age = age; 
    }

    public void eat() {
        System.out.println(this.name + " is eating"); 
    }

    abstract void sound(); 
}
```
```
package inheritance;

public class Cat extends Animal {
    private String catType; 

    public Cat(String name, int age, String catType) {
        super(name, age); 
        this.catType = catType;
    }

    public void printType() {
        System.out.println("Cat type: " + catType);
    }
    
    @Override 
    public void sound() {
        System.out.println("Meow!");
    }

}
package inheritance;

public class Dog extends Animal {
    private String dogType; 

    public Dog(String name, int age, String dogType) {
        super(name, age); 
        this.dogType = dogType;
    }

    public void printType() {
        System.out.println("Dog type: " + dogType);
    }
    
    @Override 
    public void sound() {
        System.out.println("Bark!");
    }

}
```
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
