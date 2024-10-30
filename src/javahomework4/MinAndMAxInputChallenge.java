package javahomework4;

import java.util.Scanner;

public class MinAndMAxInputChallenge {

    public static void InputChallenge() {
        Scanner scanner = new Scanner(System.in);

        Integer min = null;
        Integer max = null;

        while (true) {
            System.out.print("Enter number: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                // Update min and max
                if (min == null || number < min) {
                    min = number;
                }
                if (max == null || number > max) {
                    max = number;
                }
            } else {
                // Invalid input; break the loop
                System.out.println("Invalid number entered.");
                break;
            }

            // Clear the invalid input from the scanner
            scanner.nextLine();
        }

        // Check if any numbers were entered
        if (min == null || max == null) {
            System.out.println("No valid numbers were entered.");
        } else {
            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
        }

        scanner.close();

    }
public static void main(String[] args) {
    InputChallenge();}
}