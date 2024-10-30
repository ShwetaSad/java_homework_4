package javahomework4;

public class DiamondPattern {

    /*
    Write a program in Java to display the pattern like a diamond.
While loop

     */
    public static void main(String[] args) {
        diamondPattern();
    }

        public static void diamondPattern() {
        int rows = 6; // Total rows for the upper half of the diamond

        // First half of the diamond
        int i = 1;
        while (i <= rows) {
            // Printing spaces
            int j = rows - i;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }

            // Printing stars
            int k = 1;
            while (k <= (2 * i - 1)) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }

        // Second half of the diamond (inverted pyramid)
        i = rows - 1;
        while (i > 0) {
            // Printing spaces
            int j = rows - i;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }

            // Printing stars
            int k = 1;
            while (k <= (2 * i - 1)) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i--;
        }
    }

}
