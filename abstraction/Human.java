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
