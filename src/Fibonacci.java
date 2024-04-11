public class Fibonacci {
    public static int fibonacciWithForLoop(int n) {
        int current = 1, next = 1;
        for (int i=2; i<=n; i++) {
            int temp = current + next;
            current = next;
            next = temp;
        }
        return current;
    }

    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.printf("fib(%d) = %d%n", i, fibonacciWithForLoop(i));
        }
    }
}