package src;

public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        
        // Accessing elements of the 2D array
        System.out.println("Element at [0][0]: " + matrix[0][0]); // Output: 1
        System.out.println("Element at [2][1]: " + matrix[2][1]); // Output: 8
        System.out.println("matrix length: "+matrix.length);
        
        // Loop through the 2D array and print all elements
        System.out.println("All elements in the 2D array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "__");
            }
            System.out.println(); // Move to next line after each row

        }
    }
}
