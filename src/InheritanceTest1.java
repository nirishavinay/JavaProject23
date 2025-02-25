package src;

class Flower1{
    void colour() {
        System.out.println("Flowers are in different colours.");
    }
}
class Rose extends Flower1{
    void smell(){
        System.out.println("Rose flower smells good.");
    }
}
public class InheritanceTest1
{
    public static void main(String[] args)
    {
        Rose r = new Rose();
        r.smell();
        r.colour();
    }
}
