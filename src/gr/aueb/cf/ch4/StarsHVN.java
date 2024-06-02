package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsHVN {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println("Please insert number of horizontal and vertical stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
