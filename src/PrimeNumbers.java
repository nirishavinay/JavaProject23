package src;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 1000;
        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
