package gr.aueb.cf.ch8;
import java.util.Scanner;

public class ex1 {
    public static int getChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        System.out.print("Enter your choice (1-5): ");

        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                break;
            } else {
                System.out.print("Invalid input. Please enter an integer (1-5): ");
                scanner.next(); // consume the invalid input
            }
        }

        return choice;
    }

    public static void printChoice(int choice) {
        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException("Choice must be between 1 and 5.");
        }

        switch (choice) {
            case 1:
                System.out.println("You selected option 1.");
                break;
            case 2:
                System.out.println("You selected option 2.");
                break;
            case 3:
                System.out.println("You selected option 3.");
                break;
            case 4:
                System.out.println("You selected option 4.");
                break;
            case 5:
                System.out.println("Exiting.");
                break;
        }
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Option 4");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = getChoice();
            try {
                printChoice(choice);
                if (choice == 5) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice: " + e.getMessage());
            }
        }
    }
}
