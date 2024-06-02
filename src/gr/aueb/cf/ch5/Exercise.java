package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int stars = 0;

        do {
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 - n");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n - 1");
            System.out.println("6. Έξοδος από το πρόγραμμα");
            System.out.print("Δώσε επιλογή: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Δώσε αριθμό για αστεράκια: ");
                    stars = scanner.nextInt();
                    printHStars(stars);
                    break;
                case 2:
                    System.out.print("Δώσε αριθμό για αστεράκια: ");
                    stars = scanner.nextInt();
                    printVStars(stars);
                    break;
                case 3:
                    System.out.print("Δώσε αριθμό για αστεράκια: ");
                    stars = scanner.nextInt();
                    printLWStars(stars);
                    break;
                case 4:
                    System.out.print("Δώσε αριθμό για αστεράκια: ");
                    int stars4 = scanner.nextInt();
                    printLWAscStars(stars4);
                    break;
                case 5:
                    System.out.print("Δώσε αριθμό για αστεράκια: ");
                    int stars5 = scanner.nextInt();
                    printLWDescStars(stars5);
                    break;
                case 6:
                    System.out.println("Έξοδος από το πρόγραμμα");
                    break;
                default:
                    System.out.println("Μη έγκυρη επιλογή. Προσπαθήστε ξανά.");
                    break;
            }
        } while (choice != 6);
    }

    // Εμφάνιση n αστεράκια οριζόντια
    public static void printHStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Εμφάνιση n αστεράκια κάθετα
    public static void printVStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    // Εμφάνιση n γραμμών με n αστεράκια
    public static void printLWStars(int n) {
        for (int i = 1; i <= n; i++) {
            printHStars(n);
        }
        System.out.println();
    }

    // Εμφάνιση n γραμμών με αστεράκια 1 - n
    public static void printLWAscStars(int n) {
        for (int i = 1; i <= n; i++) {
            printHStars(i);
        }
        System.out.println();
    }

    // Εμφάνιση n γραμμών με αστεράκια n - 1
    public static void printLWDescStars(int n) {
        for (int i = n; i >= 1; i--) {
            printHStars(i);
        }
        System.out.println();
    }
}