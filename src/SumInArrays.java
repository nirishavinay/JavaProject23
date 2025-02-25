package src;

public class SumInArrays
{
    public static void main(String[] args)
    {
        int num[] = {100,200,300,400};
        int sum = 0 ;
        System.out.println("The Array elements are: ");
        for (int i = 0; i < num.length;i++)

        {
            sum += num[i];
            System.out.println("The sum of Array elements are: " + sum);
        }
    }
}
