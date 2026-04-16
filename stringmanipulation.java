import java.util.Scanner;  // Import Scanner class for user input

public class StringManipulation {
    public static void main(String[] args) {
        
        // Prompt user to enter student name
        System.out.println("Enter Student name : ");

        // Create Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Read full line input (including spaces)
        String name = sc.nextLine();

        // Convert entered name to uppercase
        String upper = name.toUpperCase();

        // Convert entered name to lowercase
        String lower = name.toLowerCase();

        // Display original name entered by user
        System.out.println("Original name : " + name);

        // Display name in uppercase
        System.out.println("UpperCase name : " + upper);

        // Display name in lowercase
        System.out.println("LowerCase name : " + lower);

        // Display length of the name (number of characters)
        System.out.println("Length of name : " + name.length());

        // Close scanner to prevent resource leak
        sc.close();
    }