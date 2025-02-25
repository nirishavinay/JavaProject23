package src;

// Custom exception for invalid input
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class InputValidation {
    public static void validateInput(String input) throws InvalidInputException {
        if (input == null || input.trim().isEmpty()) {
            throw new InvalidInputException("Input cannot be null or empty.");
        }
        System.out.println("Input is valid: " + input);
    }

    public static void main(String[] args) {
        try {
            validateInput("hello"); // This will throw the custom exception
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
