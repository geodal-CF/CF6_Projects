package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TestMenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            num = in.nextInt();

            if (num == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (num == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (num == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (num == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (num == 5) {
                System.exit(1);
            } else {
                System.out.println("Μη έγκυρος αριθμός");
            }
        } while (num != 5) ;
            System.out.println("Ευχαριστούμε");
        }
    }
