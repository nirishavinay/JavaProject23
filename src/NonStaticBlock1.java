package src;

public class NonStaticBlock1
{

    NonStaticBlock1()
    {

        System.out.println("Hello default constructor.");

    }

    public static void main(String[] args)
    {

        System.out.println("Hello non-static block program.");

        NonStaticBlock1 obj = new NonStaticBlock1();

    }

    static
    {
        System.out.println("welcome static block 1.");

        NonStaticBlock1 obj = new NonStaticBlock1("Hello");
    }

    {

        System.out.println("Welcome non-static block");
    }


    NonStaticBlock1(String str)

    {
        System.out.println("Hello Parameterized constructor");
    }

}
