package roche.assignment1;

import java.util.Scanner;

public class LongestStringFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        String longestString = findLongestString(firstString, secondString);

        System.out.println("Longest string: " + longestString);

        scanner.close();
    }

    public static String findLongestString(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();

        if (length1 > length2) {
            return str1;
        } else if (length2 > length1) {
            return str2;
        } else {
            return "Both strings have equal length.";
        }
    }
}
