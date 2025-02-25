package src;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int number = 11111;
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(11111); i++) {
            if (11111 % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && 11111 > 1) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
