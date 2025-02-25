package src;

public class MultiplyMethod
{
     public static void main(String[] args)
        {
            int num = 5;
            System.out.println("Multiplication using for loop");
            for (int i = 1; i < 10; i++) //for declaration
            {
                System.out.println(num + "X" + i + "=" + (num * i));
            }

            int j = 1;
            System.out.println("Multiplication using while loop");

            while (j <= 10) // While loop declaration
            {
                System.out.println(num + "X" + j + "=" + (num * j));
                j++;
            }
        }
    }

