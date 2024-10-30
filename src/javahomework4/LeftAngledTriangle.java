package javahomework4;

public class LeftAngledTriangle {
    public static void LeftAngledTriangle() {
        int rows = 5; // Number of rows in the triangle

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print("  ");
            }
            // Inner loop for printing '*'
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LeftAngledTriangle();
    }
}