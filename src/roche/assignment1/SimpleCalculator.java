package roche.assignment1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter the arithmetic operator (+, -, /, *): ");
        char operator = scanner.next().charAt(0);

        double result = 0.0;

        switch (operator) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '/' -> result = number1 / number2;
            case '*' -> result = number1 * number2;
            default -> System.out.println("Invalid operator!");
        }

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
