package src;

class Numbers1 {
    int Multiply(int a, int b) {
        return a * b;
    }

    int Multiply(int a, int b, int c) {
        return a * b * c;
    }

    short Multiply(short a, short b) {
        return (short) (a * b);  // Casting result to short
    }
}

public class JavaPolymorphism {
    public static void main(String[] args) {
        Numbers1 num = new Numbers1();
        System.out.println("The multiply of two integers:  " + num.Multiply(10, 20));
        System.out.println("The multiply of three integers:  " + num.Multiply(10, 20, 30));
        System.out.println("The multiply of two shorts:  " + num.Multiply((short)10, (short)20));
    }
}
