package src;

class Arthimatic1
{
    int add(int a, int b)
    {
        return a + b;
    }

    int add(int a, int b, int c)
    {
        return a + b + c;
    }

    long add(long a, long b) {
        return (long) (a + b);  // In long tyte
    }
}

public class PolymorphismInJava2 {
    public static void main(String[] args) {
        Arthimatic1 num = new Arthimatic1();
        System.out.println("The addition of two integers:  " + num.add(10, 20));
        System.out.println("The addition of three integers:  " + num.add(10, 20, 30));
        System.out.println("The addition of two longs:  " + num.add((long)100, (long)200));
    }
}

