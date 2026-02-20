import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== UC5: Stack Based Palindrome Check =====");
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Compare characters
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

        scanner.close();
    }
}