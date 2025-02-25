package src;

public class Variables
{
    static String variablename = "India";

    int variablevalue = 23;

    public static void main (String[] args)

    {
        System.out.println("Global variablename = " +variablename);

        String variablename = "Telangana";

        System.out.println("local variablename = " +variablename);
    }
}



