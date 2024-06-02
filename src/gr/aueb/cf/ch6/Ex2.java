package gr.aueb.cf.ch6;

public class Ex2 {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 9, 1};

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("Δεν υπάρχει δεύτερο μικρότερο στοιχείο.");
        } else {
            System.out.println("Το δεύτερο μικρότερο στοιχείο είναι: " + secondMin);
        }
    }
}
