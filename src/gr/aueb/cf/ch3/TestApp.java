package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TestApp {

    public static void main(String[] args) {
        int i = 4;
        int result = 1;

        do {
            result = result * i;
            i--;
        } while (i > 1);

        System.out.println(result);
    }
}