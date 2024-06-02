package gr.aueb.cf.ch7;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String replacedString = replaceWithNextAscii(input);
        System.out.println("Replaced string: " + replacedString);
        scanner.close();
    }

    public static String replaceWithNextAscii(String input) {
        char[] chars = input.toCharArray();
        StringBuilder replaced = new StringBuilder();

        for (char c : chars) {
            char nextChar = (char) (c + 1);
            replaced.append(nextChar);
        }

        return replaced.toString();
    }
}