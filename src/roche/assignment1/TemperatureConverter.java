package roche.assignment1;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

        scanner.close();
    }
}
