package javahomework4;

import java.util.Scanner;

public class VowelOrConsonant {

    /*Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.

     */
    public static void vowelOrConsonant() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single character from the alaphabet:");
        String letter = sc.next();

        if (sc.hasNext()) {
            letter = letter.toLowerCase();
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
                System.out.println("Vowel ");
            } else if (letter.length() > 1) {
                System.out.println("Error");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Error");

            sc.close();

        }

    }

    public static void main(String[] args) {
        vowelOrConsonant();
    }
}
