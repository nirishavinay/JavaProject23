package src;

public class IibObject
{

    IibObject()

    {
        System.out.println(" Hello default constructor");//3
    }

    static
    {

        System.out.println(" Hello Iib object");//1

    }

    static
    {

        IibObject iib = new IibObject();

        System.out.println(" Hello Iib object");//4

    }


    {
        System.out.println("hello iib block ");//2

    }
    public static void main(String[] args)
    {
        System.out.println("hello main method");//5
    }
}