package javahomework4;

public class DisplayTriangle {
     static int i = 1;

    public static void displayTriangle() {
        int rows = 10; // Fixed number of rows

        // Generate the triangle pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        displayTriangle();
    }
}
