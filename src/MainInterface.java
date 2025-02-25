package src;

interface Tree
{
    void branches(); //Abstract class without body

    default void leaves() //Default method contain body
    {
        System.out.println("Trees have Leaves.");
    }
}

class Plants implements Tree
{
    public void branches()
    {
        System.out.println("Plants can also have branches.");
    }
}
public class MainInterface
{
    public static void main(String args[])
    {
        Tree t = new Plants();
        t.branches();
        t.leaves();
    }

}
