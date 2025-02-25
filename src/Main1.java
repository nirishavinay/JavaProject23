package src;

abstract class TreeAbstract
{
    abstract void branches();  // Abstract method with no body

    void leaves()   // Non-abstract method with a body
    {
        System.out.println("Trees are with leaves");
    }
}

class Plant extends TreeAbstract
{
    void branches()
    {
        System.out.println("Plants have branches");
    }
    void leaves()   // Non-abstract method with a body
    {
        System.out.println("plants are with leaves");
    }
}

public class Main1
{

    public static void main(String[] args)
    {
        Plant tree = new Plant();  // Creating an object of Plants
        tree.branches();  // Calls the branches method in Plants class
        tree.leaves();    // Calls the leaves method in Plants class
    }
}

