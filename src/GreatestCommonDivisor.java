import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int gcdWithForLoop(int x, int y) {
        int highest = 1;
        for (int z = 1; z < x; z++) {
            if (x % z == 0 && y % z == 0)
                highest = z;
        }
        return highest;
    }

    public static int gcdWithWhileLoop(int x, int y) {
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        int gcd = gcdWithWhileLoop(x, y);
        System.out.printf("GCD of %d and %d is %d%n", x, y, gcd);
    }
}