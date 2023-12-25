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
