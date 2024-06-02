package gr.aueb.cf.ch6;

public class Ex4 {

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int[] result = new int[2];
        result[0] = findLowIndex(arr, key);
        result[1] = findHighIndex(arr, key);
        return result;
    }

    private static int findLowIndex(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            if (arr[mid] == key) {
                result = mid;
            }
        }
        return result;
    }

    private static int findHighIndex(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            if (arr[mid] == key) {
                result = mid;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;
        int[] result = getLowAndHighIndexOf(arr, key);
        System.out.println("Low Index: " + result[0]);
        System.out.println("High Index: " + result[1]);
    }
}
