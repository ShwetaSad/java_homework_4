package javahomework4;

public class IsPallindromeNumber {
    /*Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.
Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
11212.

     */
    public static boolean IsPallindrome(int number) {

        int originalnumber = number; // Store the original number to compare later
        int reverse = 0; // Initialize variable to hold the reversed number

        // Work with the absolute value to handle negative numbers
        number = Math.abs(number);

        while (number > 0) {
            int lastdigit = number % 10; //Extract the last digit
            reverse = reverse * 10 + number % 10;  //Build the reversed number
            number /= 10; // Remove the last digit
        }
        // Compare the reversed number with the absolute value of the original
        return Math.abs(originalnumber) == reverse;


    }
        public static void main(String[] args) {
        System.out.println(IsPallindrome(-1221));
        System.out.println(IsPallindrome(707));
        System.out.println(IsPallindrome(-707));
        System.out.println(IsPallindrome(112212));
        System.out.println(IsPallindrome(0));

        }
}
