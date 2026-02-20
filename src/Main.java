
import java.util.Scanner;
import java.util.Stack;



public class Main {

    public static void main(String[] args) {


        System.out.println("=================================");
        System.out.println("   Welcome to Palindrome App     ");
        System.out.println("=================================");

        System.out.println("Application Started Successfully.");


        System.out.println("===== UC2: Hardcoded Palindrome =====");

        String word = "MADAM";   // Hardcoded value

        String reversed = "";

        Scanner scanner = new Scanner(System.in);



        System.out.println("===== UC3: Palindrome Check Using String =====");


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


        if (word.equals(reversed)) {

            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");

            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");

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