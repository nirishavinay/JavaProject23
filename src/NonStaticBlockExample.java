package src;

public class NonStaticBlockExample {
    
    // Non-static block
    {
        System.out.println("Non-static block is executed.");
    }

    NonStaticBlockExample(){
        System.out.println("Constructor is executed.");
    }
    
    public static void main(String[] args) {
        // Creating the first object of the class
        NonStaticBlockExample obj1 = new NonStaticBlockExample();
        
        // Creating the second object of the class
        NonStaticBlockExample obj2 = new NonStaticBlockExample();
    }
}
