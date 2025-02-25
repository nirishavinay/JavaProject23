package src;

class GlobalToLocal

{

    int n = 100;
}

public class MyClass2 extends GlobalToLocal
{

    public void display()

    {
        int n = 200;

        System.out.println("LocaL variable: " +n);

        System.out.println("Global variable: " + this.n);
    }

    public static void main(String[] args)

    {

        MyClass2 obj = new MyClass2();

        obj.display();
    }
}


