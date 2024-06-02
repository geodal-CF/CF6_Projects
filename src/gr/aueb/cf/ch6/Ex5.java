package gr.aueb.cf.ch6;

import java.util.Arrays;

public class Ex5 {

    public static int findMaxCars(int[][] arr) {
        int maxCars = 0;
        int currentCars = 0;

        // Μετατρέπουμε τον πίνακα σε μορφή που να περιέχει τόσο τις ώρες άφιξης όσο και αναχώρησης
        // με ένα flag για να διαχωρίζουμε τις δύο περιπτώσεις
        int[][] events = new int[arr.length * 2][2];
        for (int i = 0; i < arr.length; i++) {
            events[i * 2] = new int[]{arr[i][0], 1};  // Άφιξη
            events[i * 2 + 1] = new int[]{arr[i][1], 0}; // Αναχώρηση
        }

        // Ταξινομούμε τα events σε αύξουσα σειρά ως προς την ώρα
        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        // Πραγματοποιούμε την αναζήτηση του μέγιστου αριθμού αυτοκινήτων
        for (int[] event : events) {
            if (event[1] == 1) { // Άφιξη
                currentCars++;
                maxCars = Math.max(maxCars, currentCars);
            } else { // Αναχώρηση
                currentCars--;
            }
        }

        return maxCars;
    }

    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}};
        int maxCars = findMaxCars(arr);
        System.out.println("Ο μέγιστος αριθμός αυτοκινήτων που είναι σταθμευμένα το ίδιο χρονικό διάστημα είναι: " + maxCars);
    }
}
