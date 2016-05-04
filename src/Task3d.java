public class Task3d {
    public static void main (String[] args) {
        // Define user input storage string
        String input;

        // Prompt user for first number
        input = System.console().readLine("Enter first number: ");
        int n1 = Integer.parseInt(input);

        // Prompt user for second number
        input = System.console().readLine("Enter first number: ");
        int n2 = Integer.parseInt(input);

        // Multiply numbers
        System.out.println("Result: " + (n1 * n2));
    }
}