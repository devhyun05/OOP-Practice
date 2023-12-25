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
