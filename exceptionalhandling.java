class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) { // Catching the specific exception only 
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
            //We can catch multiple exceptions by using multiple catch blocks

        } catch (Exception e) { 

            System.out.println("An unexpected error occurred: " + e.getMessage());

        } finally {
            System.out.println("This block will always execute.");
        }
    }
}
