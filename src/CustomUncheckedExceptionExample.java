package src;

// Custom unchecked exception
class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class CustomUncheckedExceptionExample {
    public static void withdraw(double amount) {
        if (amount <= 100) {
            throw new InvalidAmountException("Amount must be positive.");
        }
        System.out.println("Withdrawal of $" + amount + " was successful.");
    }

    public static void main(String[] args) {
        try {
            withdraw(110); // This will throw the custom unchecked exception
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
