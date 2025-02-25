package src;

interface Horse23
{
    void run();//Abstract method does not have a body

    default void eat()
    {
        System.out.println("Horse eat grass.");
    }
}
class Foal implements  Horse23
{
    public void run()
    {
        System.out.println("Foal run faster.");
    }
}
public class Interface23Java {
    public static void main(String[] args) {
        Foal foal = new Foal();
        foal.eat();
        foal.run();
    }
}
