package src;

abstract class Flowers23
{

    public abstract void smell();

    protected void colour()
    {
        System.out.println("Flowers are in different colours.");
    }
}

class Buds extends Flowers23 {
    public void smell() {
        System.out.println("Flowers smell good.");
    }
}
public class Abstract23Java {
    public static void main(String[] args){
        Flowers23 flowers23 = new Buds();
        flowers23.smell();
        flowers23.colour();
    }
}









