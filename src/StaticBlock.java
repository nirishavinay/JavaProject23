package src;

public class StaticBlock
{
        static
        {
            System.out.println("Hello static block.");
        }

        static
        {
            System.out.println("Hello static block 1.");
        }

        public static void main(String[] args)
        {
            System.out.println("inside main method.");
        }

    }
