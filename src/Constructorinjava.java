package src;

public class Constructorinjava extends Object
{
    String str = "Java";

    int n = 24;

    Constructorinjava (String str)
    {
        System.out.println("hello java constructor"    + str);
    }

    Constructorinjava()
    {
        System.out.println("hello java");
    }

    public static void main(String[] args)
    {
        System.out.println("Hi Constructor!");
        Constructorinjava ctr = new Constructorinjava();
        Constructorinjava ctr1 = new Constructorinjava ("Aarush");
    }
}


