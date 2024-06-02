package gr.aueb.cf.ch6;

public class Ex3 {

    // Αναζήτηση ενός στοιχείου στον πίνακα
    public static int findElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1; // Επιστρέφει -1 αν το στοιχείο δε βρέθηκε
    }

    // Φιλτράρισμα των ζυγών
    public static void filterEven(int[] arr) {
        System.out.print("Ζυγά στοιχεία: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Mapping κάθε στοιχείου του πίνακα με το διπλάσιο
    public static int[] mapDouble(int[] arr) {
        int[] doubledArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            doubledArr[i] = arr[i] * 2;
        }
        return doubledArr;
    }

    // Έλεγχος αν υπάρχει έστω ένας θετικός αριθμός
    public static boolean hasPositive(int[] arr) {
        for (int num : arr) {
            if (num > 0) {
                return true;
            }
        }
        return false;
    }

    // Έλεγχος αν όλα τα στοιχεία του πίνακα είναι θετικοί
    public static boolean allPositive(int[] arr) {
        for (int num : arr) {
            if (num <= 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, -2, 3, 4, -5, 6};

        // Αναζήτηση του στοιχείου 4 στον πίνακα
        int position = findElement(array, 4);
        if (position != -1) {
            System.out.println("Το στοιχείο 4 βρίσκεται στη θέση: " + position);
        } else {
            System.out.println("Το στοιχείο 4 δεν βρέθηκε.");
        }

        // Φιλτράρισμα των ζυγών στοιχείων
        filterEven(array);

        // Mapping κάθε στοιχείου με το διπλάσιο του
        int[] doubledArray = mapDouble(array);
        System.out.print("Ο πίνακας με το διπλάσιο κάθε στοιχείου: ");
        for (int num : doubledArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Έλεγχος αν υπάρχει έστω ένας θετικός αριθμός
        boolean hasPositive = hasPositive(array);
        if (hasPositive) {
            System.out.println("Υπάρχει τουλάχιστον ένας θετικός αριθμός.");
        } else {
            System.out.println("Δεν υπάρχει θετικός αριθμός.");
        }

        // Έλεγχος αν όλα τα στοιχεία είναι θετικά
        boolean allPositive = allPositive(array);
        if (allPositive) {
            System.out.println("Όλα τα στοιχεία είναι θετικά.");
        } else {
            System.out.println("Τουλάχιστον ένα από τα στοιχεία δεν είναι θετικό.");
        }
    }
}
