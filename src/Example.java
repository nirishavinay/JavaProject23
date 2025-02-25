package src;

public class Example

{
    int num;


    public void method()

    {

        System.out.println("Value of num: " + num);
    }

    public static void main(String[] args)

    {
        Example obj = new Example();

        obj.num = 100;

        obj.method();

    }
}