package src;

public class GlobalLocalvariablesInJava
{

    static int global_var= 100; // Declaring global variable

    public static void main(String [] args)

    {
        int i = 10; //Declaring local variable
        int j = 40;
        int sum = i+j+global_var;

        System.out.println("The sum of local and global variables: " +sum);

    }


}


