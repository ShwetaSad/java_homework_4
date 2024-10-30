package javahomework4;

import java.util.Scanner;

public class ArmstrongNumber {
    /*
    Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
     */
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int digit = String.valueOf(number).length(); // Get the number of digits
        // Calculate the sum of the digits raised to the power of the number of digits
        while (number > 0) {
            int remainder = number % 10;
            sum += Math.pow(remainder, digit);
            number /= 10;
        }
        return sum == originalNumber; // check sum equals the original number
    }





    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(isArmstrongNumber(num)){
                System.out.println(num + " is an Armstrong number");
            }else{
            System.out.println(num + " is not an Armstrong number");

            }
            input.close();}

    }
