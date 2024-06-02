package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το εμβαδόν ενός
 * παραλληλογράμμου.
 */
public class CalculateRectangleAreaApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;

        System.out.println("Please insert two doubles");
        width = in.nextDouble();
        height = in.nextDouble();

        area = calculateArea(width, height);
    }

    /**
     * Υπολογίζει το εμβαδόν ενός παραλληλογράμμου.
     *
     * @param width     πλάτος παραλληλογράμμου
     * @param height    ύψος παραλληλογράμμου
     * @return          επιστρέφει το εμβαδόν
     */
    public static double calculateArea(double width, double height) {
        return width * height;
    }
}
