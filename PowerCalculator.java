import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base number x
        System.out.print("Enter the base number (x): ");
        double x = scanner.nextDouble();

        // Prompt the user to enter the exponent n
        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();

        // Calculate x^n using the power function
        double result = power(x, n);

        // Display the result
        System.out.println(x + " raised to the power of " + n + " is: " + result);

        scanner.close();
    }

    // Function to calculate x^n
    public static double power(double x, int n) {
        return Math.pow(x, n);
    }
}
