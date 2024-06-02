package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsNDesc {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println("Please insert number of horizontal and vertical stars (initial value)");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}