package src;

public class LargestValueInArray

{
    public static void main(String[] args)

    {
        int numbers[] = {10,45,87,293,407};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > largest)
            {
                largest = numbers[i];
            }
        }

            System.out.println("The largest element of arrays:" + largest);
           }
        }

