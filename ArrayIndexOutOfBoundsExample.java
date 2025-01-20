package lab13;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        // Create an array with 10 randomly chosen integers
        int[] array = new int[10];
        Random random = new Random();
        
        // Fill the array with random integers between 1 and 100
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        // Display the array (optional, for debugging purposes)
        System.out.print("Array elements: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Prompt the user to enter the index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index (0-9): ");
        
        try {
            int index = scanner.nextInt();
            // Display the corresponding element value
            System.out.println("Element at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle index out of bounds
            System.out.println("Out of Bounds");
        } catch (Exception e) {
            // Handle other input-related exceptions
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}
