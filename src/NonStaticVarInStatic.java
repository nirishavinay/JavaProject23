package src;

public class NonStaticVarInStatic

{
    String str = "Neelima";
    int num = 100;
    float f = 0.889f;

    public static void main(String[] args)

    {
        NonStaticVarInStatic java = new NonStaticVarInStatic();

        System.out.println("non static variable: " + java.str);
        System.out.println("non static variable: " + java.num);
        System.out.println("non static variable: " + java.f);

    }
}
