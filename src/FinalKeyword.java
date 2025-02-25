package src;

public class FinalKeyword
{
   final  int max_value = 100;

    public void Maxmethod()
    {
        int num = 200;

        System.out.println("The actual maximum value :  "  + max_value);
        System.out.println("After using this keyword, maximum value :  "+ this.max_value);

    }
    public static void main(String[] args)
    {
        FinalKeyword f = new FinalKeyword();

        f.Maxmethod();
    }

}
