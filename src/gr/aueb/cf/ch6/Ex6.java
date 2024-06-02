package gr.aueb.cf.ch6;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ζητάμε από τον χρήστη να εισάγει έξι ακεραίους από 1 έως 49
        int[] numbers = new int[6];
        System.out.println("Εισάγετε έξι ακέραιους αριθμούς από 1 έως 49:");
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] < 1 || numbers[i] > 49) {
                System.out.println("Ο αριθμός πρέπει να είναι από 1 έως 49. Προσπαθήστε ξανά.");
                i--; // Επαναλαμβάνουμε την εισαγωγή για τον ίδιο αριθμό
            }
        }

        // Έλεγχος των προδιαγραφών
        if (checkPredicates(numbers)) {
            System.out.println("Η εξάδα περνάει όλα τα φίλτρα.");
        } else {
            System.out.println("Η εξάδα δεν περνάει όλα τα φίλτρα.");
        }
    }

    public static boolean checkPredicates(int[] numbers) {
        return checkEvenOdd(numbers) && checkConsecutive(numbers) && checkDistinctLastDigits(numbers) && checkDistinctTens(numbers);
    }

    // Ελέγχουμε αν η εξάδα έχει περισσότερους από τρεις άρτιους ή περισσότερους από τρεις περιττούς
    public static boolean checkEvenOdd(int[] numbers) {
        int evenCount = 0;
        int oddCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return evenCount <= 3 && oddCount <= 3;
    }

    // Ελέγχουμε αν η εξάδα έχει περισσότερους από τρεις συνεχόμενους αριθμούς
    public static boolean checkConsecutive(int[] numbers) {
        int consecutiveCount = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1] + 1) {
                consecutiveCount++;
            } else {
                consecutiveCount = 1;
            }
            if (consecutiveCount > 3) {
                return false;
            }
        }
        return true;
    }

    // Ελέγχουμε αν η εξάδα έχει περισσότερους από τρεις αριθμούς με τον ίδιο λήγοντα
    public static boolean checkDistinctLastDigits(int[] numbers) {
        int[] lastDigitsCount = new int[10];
        for (int number : numbers) {
            lastDigitsCount[number % 10]++;
        }
        for (int count : lastDigitsCount) {
            if (count > 3) {
                return false;
            }
        }
        return true;
    }

    // Ελέγχουμε αν η εξάδα έχει περισσότερους από τρεις αριθμούς στην ίδια δεκάδα
    public static boolean checkDistinctTens(int[] numbers) {
        int[] tensCount = new int[5];
        for (int number : numbers) {
            tensCount[number / 10]++;
        }
        for (int count : tensCount) {
            if (count > 3) {
                return false;
            }
        }
        return true;
    }
}