package roche.assignment1;

import java.util.Scanner;

public class GreatestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        int greatestNumber = findGreatestNumber(number1, number2, number3);

        System.out.println("The greatest number is: " + greatestNumber);

        scanner.close();
    }

    public static int findGreatestNumber(int number1, int number2, int number3) {
        int max = number1;

        if (number2 > max) {
            max = number2;
        }

        if (number3 > max) {
            max = number3;
        }

        return max;
    }
}
