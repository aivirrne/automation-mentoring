package roche.assignment1;

import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter the length of side 2: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter the length of side 3: ");
        int side3 = scanner.nextInt();

        boolean isTriangle = checkTriangle(side1, side2, side3);

        if (isTriangle) {
            System.out.println("It is possible to create a triangle.");
        } else {
            System.out.println("It is not possible to create such triangle.");
        }

        scanner.close();
    }

    public static boolean checkTriangle(int a, int b, int c) {
        boolean condition1 = (a + b > c);
        boolean condition2 = (b + c > a);
        boolean condition3 = (c + a > b);

        return condition1 && condition2 && condition3;
    }
}
