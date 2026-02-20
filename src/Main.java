import java.util.Scanner;

public class Main {

    // Method to clean the string (remove special characters & spaces)
    public static String cleanString(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    // Method to check palindrome
    public static boolean isPalindrome(String input) {
        String cleaned = cleanString(input);
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Advanced Palindrome Application (UC6) =====");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter a word or sentence: ");
                    String input = scanner.nextLine();

                    if (isPalindrome(input)) {
                        System.out.println("✅ \"" + input + "\" is a Palindrome.");
                    } else {
                        System.out.println("❌ \"" + input + "\" is NOT a Palindrome.");
                    }
                    break;

                case 2:
                    System.out.println("Thank you for using Advanced Palindrome Checker!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 2);

        scanner.close();
    }
}