package src;

public class Factorial {
    public static void main(String[] args) {
        int number = 10;
        int result = 1;
        for(int i= 1;i<=10;i++){
            result*=i;
            System.out.println("The Factorial of number 10: " + result);
        }
    }
}
