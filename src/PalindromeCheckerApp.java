import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeService palindromeService = new PalindromeService();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = palindromeService.checkPalindrome(input);

        if (result) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

        scanner.close();
    }
}
class PalindromeService {
    public boolean checkPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        String processed = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char ch : processed.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : processed.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}