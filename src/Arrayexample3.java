package src;

public class Arrayexample3 {
    public static void main(String[] args)
    {
        int[] numbers = new int[10];
        System.out.println("Default values of the array:");
        for (int num : numbers)
        {
            System.out.println(num);
        }
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 60;
        numbers[6] = 70;
        numbers[7] = 80;
        numbers[8] = 90;
        numbers[9] = 100;

        System.out.println("Updated values of the array:");
        for (int num=0;num<numbers.length;num++) {
            System.out.println(numbers[num]);
        }
    }
}
