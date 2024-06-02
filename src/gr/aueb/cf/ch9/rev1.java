package gr.aueb.cf.ch9;
import java.io.*;
import java.util.*;

public class rev1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        String inputFileName = "numbers.txt";
        String outputFileName = "filtered_combinations.txt";

        // Read numbers from file
        try (Scanner scanner = new Scanner(new File(inputFileName))) {
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Input file not found.");
            return;
        }

        // Validate the number of integers read
        if (numbers.size() <= 6 || numbers.size() > 49) {
            System.err.println("The file must contain more than 6 and at most 49 numbers.");
            return;
        }

        // Validate number range
        for (int number : numbers) {
            if (number < 1 || number > 49) {
                System.err.println("Numbers must be in the range from 1 to 49.");
                return;
            }
        }

        // Sort the numbers
        Collections.sort(numbers);

        // Generate all combinations of 6 numbers
        List<int[]> combinations = new ArrayList<>();
        generateCombinations(numbers, 6, 0, new int[6], 0, combinations);

        // Filter combinations
        List<int[]> filteredCombinations = new ArrayList<>();
        for (int[] combination : combinations) {
            if (isValidCombination(combination)) {
                filteredCombinations.add(combination);
            }
        }

        // Write filtered combinations to file
        try (PrintWriter writer = new PrintWriter(new File(outputFileName))) {
            for (int[] combination : filteredCombinations) {
                writer.println(Arrays.toString(combination));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Output file could not be created.");
        }
    }

    // Generate combinations of k elements from the given list
    public static void generateCombinations(List<Integer> numbers, int k, int startIndex, int[] combination, int index, List<int[]> combinations) {
        if (index == k) {
            combinations.add(combination.clone());
            return;
        }

        for (int i = startIndex; i < numbers.size(); i++) {
            combination[index] = numbers.get(i);
            generateCombinations(numbers, k, i + 1, combination, index + 1, combinations);
        }
    }

    // Check if the combination is valid based on the given criteria
    public static boolean isValidCombination(int[] combination) {
        int evenCount = 0;
        int oddCount = 0;
        int consecutiveCount = 0;
        Map<Integer, Integer> lastDigitCount = new HashMap<>();
        Map<Integer, Integer> decadeCount = new HashMap<>();

        for (int i = 0; i < combination.length; i++) {
            int number = combination[i];
            if (number % 2 == 0) evenCount++;
            else oddCount++;

            // Count consecutive numbers
            if (i > 0 && combination[i] == combination[i - 1] + 1) consecutiveCount++;
            else consecutiveCount = 1;

            // Count same last digit
            int lastDigit = number % 10;
            lastDigitCount.put(lastDigit, lastDigitCount.getOrDefault(lastDigit, 0) + 1);

            // Count numbers in the same decade
            int decade = number / 10;
            decadeCount.put(decade, decadeCount.getOrDefault(decade, 0) + 1);
        }

        boolean valid = evenCount <= 4 && oddCount <= 4 && consecutiveCount <= 2;

        for (int count : lastDigitCount.values()) {
            if (count > 3) valid = false;
        }

        for (int count : decadeCount.values()) {
            if (count > 3) valid = false;
        }

        return valid;
    }
}
