package javahomework4;

public class FibonacciNumber {

// Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

    public static void fibonacciNumber() {
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
    public static void main(String[] args) {
        fibonacciNumber();
    }
}
