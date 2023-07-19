package roche.assignment1;

import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            System.out.println(digit);
            sum += digit;
            System.out.println(sum);
            number /= 10;
        }

        System.out.println("Sum of the digits: " + sum);

        scanner.close();
    }
}
