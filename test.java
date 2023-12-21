// 4 pillars of OOP

// polymorphism

abstract class Animal {
    void sound() {
        System.out.println("Default sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("bark!"); 
    }
}