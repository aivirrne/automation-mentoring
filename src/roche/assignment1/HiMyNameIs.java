package roche.assignment1;

import java.util.Scanner;

public class HiMyNameIs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Hi, my name is " + firstName + " " + lastName);

        scanner.close();
    }
}
