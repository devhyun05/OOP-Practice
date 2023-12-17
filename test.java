// 4 pillars of OOP

// encapsulation is something we hide the important part inside of the capsule 
// display only some accessible functions that does not harm the program to users

class TestClass {
    // SIN number is critical
    private int SIN; 

    // we can only print the SIN, not allowed to modify 
    public void printSIN() {
        System.out.println("Print SIN: " + SIN); 
    }
}