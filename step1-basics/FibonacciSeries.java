import java.util.Arrays;

public class FibonacciSeries {

    static int fibonacci(int N) {

        // Base Condition.
        if (N <= 1) {
            return N;
        }

        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = fibonacci(N - 1);
        int slast = fibonacci(N - 2);

        return last + slast;
    }

    public static void main(String[] args) {
        int n = 5;
        if (n == 0) {
            System.out.println(0);
        } else {
            int fib[] = new int[n + 1];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            System.out.println("The Fibonacci Series up to " + n + "th term:" + Arrays.toString(fib));
        }

        System.out.println(fibonacci(n));
    }
}