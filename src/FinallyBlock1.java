package src;

public class FinallyBlock1
{
    public static void main(String[] args) {
        try{
        String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e)
        {
            System.out.println("NullpointerException  " +e.getMessage());
        }
        finally {
            System.out.println("In finally block");
        }
    }
}
