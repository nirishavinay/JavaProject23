package src;

public class ExceptionInJava
{
    public static void main(String[] args)
    {
        int i = 100, b = 0;

        try
        {
            int result = i / b;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        String str = null;  // str is null
        try
         {
            System.out.println(str.length());  // Trying to call method on null object
        }
        catch (NullPointerException e)
        {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        int[] num = {1, 2, 3};
        try {
            System.out.println(num[8]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

    }
}

