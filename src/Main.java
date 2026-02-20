
import java.util.Scanner;
import java.util.Stack;



public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("===== UC4: Character Array Based Palindrome =====");
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Convert string to character array
        char[] characters = word.toCharArray();

        boolean isPalindrome = true;

        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");

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

        System.out.println("Welcome to Palindrome Application");

    }
}