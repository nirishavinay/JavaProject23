package src;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector object with an initial capacity of 5
        Vector<String> vector = new Vector<>(5);

        // Adding elements to the vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        vector.add("Grapes");

        // Display the vector
        System.out.println("Vector: " + vector);

        // Accessing elements using index
        System.out.println("First element: " + vector.get(0));
        System.out.println("Second element: " + vector.get(1));

        // Removing an element
        vector.remove("Banana");

        // Display the vector after removing an element
        System.out.println("Vector after removing Banana: " + vector);

        // Check the size of the vector
        System.out.println("Size of vector: " + vector.size());

        // Checking if the vector contains an element
        if (vector.contains("Apple")) {
            System.out.println("Apple is in the vector.");
        } else {
            System.out.println("Apple is not in the vector.");
        }

        // Clearing all elements in the vector
        vector.clear();

        // Display the vector after clearing
        System.out.println("Vector after clearing: " + vector);
    }
}
