package src;

class Flower
{
    void smell() {
        System.out.println("Flowers have a pleasent smell");
    }
}
    class Bud extends Flower
    {
        void colour()
        {
            System.out.println("Buds are in different colours");
        }
    }
public class Inheritance1
{
    public static void main(String[] args) {
         Bud b = new Bud();
         b.colour();
         b.smell();
    }
}
