package src;

public class FinallyBlock4 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("Caught NullPointerException");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Caught ArithmeticException");
        }
        catch (ArrayIndexOutOfBoundsException e) {

        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}

