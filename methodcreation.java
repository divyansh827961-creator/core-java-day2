// Program to demonstrate method creation in Java
// It performs basic arithmetic operations using static methods

public class MethodCreation {
   
    // Method for multiplication
    public static int multiplication(int a, int b) {
        return a * b;  // returns product of two numbers
    }

    // Method for subtraction
    public static int subtraction(int a, int b) {
        return a - b;  // returns difference of two numbers
    }

    // Method for addition
    public static int addition(int a, int b) {
        return a + b;  // returns sum of two numbers
    }

    // Method for division
    public static int division(int a, int b) {
        // Check for division by zero to avoid runtime error
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return 0;
        }
        return a / b;  // returns quotient
    }

    // Main method (program execution starts here)
    public static void main(String[] args) {

        // Declare and initialize variables
        int a = 5;
        int b = 6;

        // Call methods and display results
        System.out.println("Addition is : " + addition(a, b));
        System.out.println("Subtraction is : " + subtraction(a, b));
        System.out.println("Multiplication is : " + multiplication(a, b));
        System.out.println("Division is : " + division(a, b));

        // Extra demonstration
        System.out.println("---- Additional Test ----");
        System.out.println("Division with zero: " + division(a, 0));
    }
}