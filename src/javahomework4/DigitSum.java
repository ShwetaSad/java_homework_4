package javahomework4;

public class DigitSum {
 /*   Write a method named sumFirstAndLastDigit with one parameter of type int called number.
    The method needs to find the first and the last digit of the parameter number passed to the method,
    using a loop and return the sum of the first and the last digit of that number.
    If the number is negative then the method needs to return -1 to indicate an invalid value.

  */
    public static int sumFirstAndLastDigit(int number){
if (number<0){
    return -1; // return -1 if the number is negative

}
int lastDigit = number%10; // Get the last Digit
int firstDigit = number;

// Loop to find the first digit
        while (firstDigit >=10 ){
            firstDigit /= 10;

        } // Return the sum of first digit and last digit
        return firstDigit+lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(186));
        System.out.println(sumFirstAndLastDigit(202));
        System.out.println(sumFirstAndLastDigit(199));
        System.out.println(sumFirstAndLastDigit(198));
    }
}
