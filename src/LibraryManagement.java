package src;

import java.util.Scanner;

class BookManagement {
    protected static Scanner scanner = new Scanner(System.in);
    // method for book Categories department wise
    public void bookCategoriesDeptWise() {
        System.out.println("Enter department name (e.g., Telugu, Hindi, English, Math, Science, Social, etc.): ");
        String department = scanner.nextLine();

        System.out.println("Enter book category for " + department + " department: ");
        String category = scanner.nextLine();

        System.out.println("Books in the " + department + " department, category: " + category + " are managed.");
    }

    // Method for subject books
    public void classSubjectWise() {
        System.out.println("Enter subject books (e.g., Telugu, Hindi, English, Math, Science, Social, etc.): ");
        String subject = scanner.nextLine();

        System.out.println("Books related to " + subject + " are managed.");
    }
}

class InventoryManagement extends BookManagement {

    // Method for tracking books in inventory
    public void bookTracking() {
        System.out.println("Enter book title to track: ");
        String bookTitle = scanner.nextLine();
        System.out.println("Tracking book: " + bookTitle + " is available in inventory.");
    }

    // Method to purchase books
    public void booksPurchase() {
        System.out.println("Enter book title to purchase: ");
        String bookTitle = scanner.nextLine();
        System.out.println("Purchasing book: " + bookTitle);
    }

    // Method to track damaged books
    public void damageBooksTracking() {
        System.out.println("Enter book title that is damaged: ");
        String bookTitle = scanner.nextLine();
        System.out.println("Tracked damaged book: " + bookTitle);
    }

    public static void closeScanner() {
        scanner.close();
    }

}

public class LibraryManagement {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();
        inventory.bookCategoriesDeptWise();
        inventory.classSubjectWise();
        inventory.bookTracking();
        inventory.booksPurchase();
        inventory.damageBooksTracking();

        InventoryManagement.closeScanner();
    }
}
