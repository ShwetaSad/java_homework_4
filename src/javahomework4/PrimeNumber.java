package javahomework4;

import java.util.Scanner;

public class PrimeNumber {
    /*Write a programme to input any number and check if it is prime or not.

     */
public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;// Numbers less than or equal to 1 are not prime
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false; // number is divible by i, so it is not prime

        }
    }
    return true; // number is prime
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");

    int n = sc.nextInt();
    if (isPrime(n)) {
        System.out.println(n + " is a prime number");
    }else {
        System.out.println(n + " is not a prime number");
    }
    sc.close();
    }
}



