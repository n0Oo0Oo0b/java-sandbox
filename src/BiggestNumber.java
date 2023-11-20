import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        String largestNumber;
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            largestNumber = "first";
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            largestNumber = "second";
        } else {
            largestNumber = "third";
        }
        System.out.printf("The %s number is the largest%n", largestNumber);
    }
}