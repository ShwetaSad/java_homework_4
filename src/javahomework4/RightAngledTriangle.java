package javahomework4;

public class RightAngledTriangle {
    /*
    8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
     */

    public static void rightAngledTriangle() {
        int rows = 5; // Number of rows for the triangle

        // Generate the right angle triangle pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@"); // Print the @ symbol
            }
            System.out.println(); // Move to the next line after each row
        }

    }
    public static void main(String[] args) {
        rightAngledTriangle();

    }
}
