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
