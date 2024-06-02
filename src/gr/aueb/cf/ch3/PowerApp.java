package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το base^power.
 * Ο χρήστης δίνει τα base, power.
 */
public class PowerApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("Please insert base, power");
        base = in.nextInt();
        power = in.nextInt();

        while (i <= power) {
            result *= base;
            i++;
        }

        System.out.printf("%d ^ %d = %,d", base, power, result);
    }
}
