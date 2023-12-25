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
