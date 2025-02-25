package src;

class Mammal
{
    void walk()
    {
        System.out.println("Mammal is sleeping");
    }
}

class Animal extends Mammal
{
    @Override
    void walk()
    {
        System.out.println("Animal is walking");
    }
}

class Snakes extends Mammal
{
    @Override
    void walk() {
        System.out.println("Snake is slithering");
    }
}

public class PolymorphismInJava22 {
    public static void main(String[] args)
    {
        Mammal mammal = new Mammal();
        Mammal animal = new Animal();
        Mammal snake = new Snakes();

        mammal.walk();
        animal.walk();
        snake.walk();
    }
}

