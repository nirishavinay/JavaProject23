package src;

public class String2
{
    public static void main(String[] args)
    {
        String s = "Hello String in Java";
         System.out.println(" Actual String is: " +s);

        String upper = s.toUpperCase();// String in uppercase
        System.out.println( " String type is in Uppercase: " +s.toUpperCase());

        String lower = s.toLowerCase();// String in lowercase
        System.out.println( " String type is in Lowercase: " +s.toLowerCase());
    }
}

