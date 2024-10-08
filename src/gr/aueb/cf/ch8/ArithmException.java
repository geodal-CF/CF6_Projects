package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmException extends Throwable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        try {
            System.out.println("Please insert numerator and denominator");
            numerator = in.nextInt();
            denominator = in.nextInt();

            result = numerator / denominator;

            System.out.printf("%d / %d = %d", numerator, denominator, result);
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("Error. Denominator can not be zero");
        }

        System.out.println("\nThanks for using the app");
    }
}
