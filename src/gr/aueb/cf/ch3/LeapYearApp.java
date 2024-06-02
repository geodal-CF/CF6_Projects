package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean isLeapYear = false;

        System.out.println("Please insert year");
        year = in.nextInt();

        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);

        if (isLeapYear) {
            System.out.println("Given year is a leap year");
        } else {
            System.out.println("Given year is not a leap year");
        }
    }
}
