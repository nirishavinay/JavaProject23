package src;

public class Fibonacci {
    public static void main(String[] args) {
        int terms = 10;
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        
        for (int i = 1; i <= terms;i++) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
