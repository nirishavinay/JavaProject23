package src;

public class BasicCalculatorNoInput {
    public static void main(String[] args) {
        // Predefined numbers for the calculation
        double num1 = 20;
        double num2 = 40;

        // Predefined operation (1 for addition, 2 for subtraction, 3 for multiplication, 4 for division// Here we choose division as an example

        double result = 0;
int choice= 4;
        // Switch case to perform the operation based on the predefined choice
        switch(choice) {
            case 1: // Addition
                result = num1 + num2;
                System.out.println("Addition: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2: // Subtraction
                result = num1 - num2;
                System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3: // Multiplication
                result = num1 * num2;
                System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4: // Division
                // Checking if the second number is not zero to avoid division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            case 5:
                result = num1 % num2;
                System.out.println("Modulus: " + num1 + " - " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }
    }
}
