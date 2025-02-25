package src;

public class FinallyBlock5
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Try block executed");
            int result = 10/0;
        }
        finally
        {
            System.out.println("finally block executes");
        }
    }
}
