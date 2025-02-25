package src;

public class MyClass10
{
    int num;

    public void method()
    {
        System.out.println("The value of num =  "  +num);
    }
    public static void main(String[] args)
    {
        MyClass10  obj = new MyClass10();
        obj.num = 100;
        obj.method();// call method
    }

}