package src;

public class IfElseStatement
{
public static void main(String [] args)
{
    int i = 26;
    if (i<20) {
        System.out.println("Eligible to voting age");
    }
    else if (i>=28)
    {
        System.out.println("execute else if statement");
    }
        else
        {
            System.out.println("Not eligible to voting age");
    }

}

}
