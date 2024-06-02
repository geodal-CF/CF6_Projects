package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10 γραμμές από
 * αστέρια σε αύξουσα σειρά,
 * 1η σειρά -> 1 αστέρι
 * 2η σειρά -> 2 αστέρια,
 * κ.ο.κ.
 */
public class Stars10Asc {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
