package gr.aueb.cf.ch7;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String replacedString = replaceWithPreviousAscii(input);
        System.out.println("Replaced string: " + replacedString);
        scanner.close();
    }

    public static String replaceWithPreviousAscii(String input) {
        char[] chars = input.toCharArray();
        StringBuilder replaced = new StringBuilder();

        for (char c : chars) {
            char previousChar = (char) (c - 1);
            replaced.append(previousChar);
        }

        return replaced.toString();
    }
}