package src;

interface Animal1
{
        void sound();
    }

    abstract class Mammal1
    {
        abstract void eat();
    }

    class Dog2 extends Mammal1 implements Animal1 {
        public void sound()
        {
            System.out.println("Bark");
        }

        public void eat()
        {
            System.out.println("Dog is eating.");
        }
    }

    public class AbstractInterface
    {
        public static void main(String[] args) {
            Dog2 dog = new Dog2();
            dog.sound();  // Output: Bark
            dog.eat();    // Output: Dog is eating.
        }
    }

