package javahomework4;

public class EvenDigitsSum {
    /*
    Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
     */
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;  // Return -1 for negative numbers
        }

        int sum = 0;

        // Loop to process each digit
        while (number > 0) {
            int digit = number % 10;  // Extract the last digit
            if (digit % 2 == 0) {     // Check if the digit is even
                sum += digit;         // Add even digit to sum
            }
            number /= 10;             // Remove the last digit
        }

        return sum;  // Return the sum of even digits
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(getEvenDigitSum(123456));  // Output: 12 (2 + 4 + 6)
        System.out.println(getEvenDigitSum(252));     // Output: 4 (2 + 2)
        System.out.println(getEvenDigitSum(-22));     // Output: -1 (invalid input)
    }

}
