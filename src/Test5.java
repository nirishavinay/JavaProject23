package src;

public class Test5 {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        int i = 1;

        do {
            sum += i;
            i++;
        } while (i <= num);

        System.out.println(sum);
    }
}
