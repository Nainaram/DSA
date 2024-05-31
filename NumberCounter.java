 import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        while (true) {
            System.out.print("Enter a number (or type 'stop' to finish): ");
            String input = scanner.nextLine();

            // Check if the user wants to stop
            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);

                if (number > 0) {
                    positiveCount++;
                } else if (number < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or type 'stop' to finish.");
            }
        }

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);

        scanner.close();
    }
}
 