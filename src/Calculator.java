import java.util.Scanner;

interface Operation {
    Double run(Double a, Double b);
}

public class Calculator {

    private static Operation get_operation(String op_string) {
        return switch (op_string) {
            case "add" -> (a, b) -> a + b;
            case "subtract" -> (a, b) -> a - b;
            case "multiply" -> (a, b) -> a * b;
            case "divide" -> (a, b) -> a / b;
            default -> throw new RuntimeException("Invalid operation: " + op_string);
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        scanner.nextLine();  // Skip newline after number when redirecting input
        String opName = scanner.nextLine().strip();

        double result = get_operation(opName).run(firstNumber, secondNumber);
        System.out.printf("Result: %f", result);
    }
}
