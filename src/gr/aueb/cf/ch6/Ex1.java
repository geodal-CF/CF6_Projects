package gr.aueb.cf.ch6;

public class Ex1 {

    public static void main(String[] args) {
        int[] arr = {5, 2, 10, 8, 3};
        int maxIndex = getMaxPosition(arr, 0, arr.length - 1);
        System.out.println("Η θέση του μέγιστου στοιχείου είναι: " + maxIndex);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        if (low == high) {
            return low;
        } else {
            int mid = (low + high) / 2;
            int maxIndexLeft = getMaxPosition(arr, low, mid);
            int maxIndexRight = getMaxPosition(arr, mid + 1, high);
            if (arr[maxIndexLeft] > arr[maxIndexRight]) {
                return maxIndexLeft;
            } else {
                return maxIndexRight;
            }
        }
    }
}
