package src;

// Interface
interface Animal22
{
    void sound();

    // Abstract method
     default void sleep()
     {
        System.out.println("Animal is sleeping.");
    }
}
// Class that implements the interface
class Dog implements Animal22
{
    // Providing implementation for the abstract method
    public void sound() {
        System.out.println("The dog barks.");
    }

}

class Main11 {
    public static void main(String[] args) {
        Animal22 dog = new Dog();  // Create an object of Dog, using the Animal interface
        dog.sound();
        dog.sleep();// Output: The dog barks.

    }
}
