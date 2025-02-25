package src;

public class Constructoroverloading
{
        String str = "India";

        int n = 2024;
        char c = 'c';

        Constructoroverloading(String str,String str1)
        {
            System.out.println("Hello java constructor"    + str + "last name"  +str1);
        }

        Constructoroverloading (String str)
        {
            System.out.println("Hello java constructor"    + str);
        }

        Constructoroverloading()
        {
            System.out.println("Hello java program");
        }

        public static void main(String[] args)
        {
            System.out.println("Hi Constructoroverloading!");

            Constructoroverloading ctr = new Constructoroverloading();
            Constructoroverloading ctr1 = new Constructoroverloading("Aarush");
            Constructoroverloading ctr2 = new Constructoroverloading("Akshara" ,"kutti");

        }
    }


