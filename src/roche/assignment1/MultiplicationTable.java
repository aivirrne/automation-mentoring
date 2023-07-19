package roche.assignment1;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int number = 2; number <= 10; number++) {
            System.out.println("Table of " + number + ":");

            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                int result = number * multiplier;
                System.out.println(number + " * " + multiplier + " = " + result);
            }

            System.out.println();
        }
    }
}
