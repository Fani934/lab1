package lab13;
import java.util.Scanner;
public class DivisionGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user for the first integer
            System.out.print("Enter the first integer: ");
            int numerator = scanner.nextInt();

            // Prompt the user for the second integer
            System.out.print("Enter the second integer: ");
            int denominator = scanner.nextInt();

            // Perform division and handle the output
            if (denominator == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                // Perform both integer and floating-point division for better understanding
                int intResult = numerator / denominator;
                double floatResult = (double) numerator / denominator;
                System.out.println("Integer division result: " + intResult);
                System.out.println("Precise result: " + floatResult);
            }

        } catch (ArithmeticException e) {
            // Handle any unexpected arithmetic exceptions
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handle invalid (non-integer) inputs
            System.out.println("Invalid input. Please enter integer numbers only.");
        } finally {
            scanner.close();
        }
    }
}
