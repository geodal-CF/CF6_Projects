package gr.aueb.cf.ch2;

import java.util.Scanner;

public class FahrenheitConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int temp = 0;
        int celsius = 0;

        System.out.println("Please insert Fahrenheit temperature");
        temp = in.nextInt();

        celsius = 5 * (temp - 32) / 9;

        System.out.printf("Celsius temperature: %d", celsius);
    }
}
