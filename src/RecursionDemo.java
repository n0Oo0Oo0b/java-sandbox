public class RecursionDemo {
    public static void main(String[] args) {
        System.out.println(iterativeFactorial(5));
        System.out.println(recursiveFactorial(5));
        System.out.println(iterativeGCD(21, 14));
        System.out.println(recursiveGCD(21, 14));
    }

    public static int iterativeFactorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int recursiveFactorial(int n) {
        if (n <= 1)
            return 1;
        return n * recursiveFactorial(n - 1);
    }

    public static int iterativeGCD(int a, int b) {
        for (int i = Math.min(a, b); i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static int recursiveGCD(int a, int b) {
        if (b == 0)
            return a;
        return recursiveGCD(b, a % b);
    }
}
