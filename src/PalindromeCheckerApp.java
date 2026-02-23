public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        boolean isPalindrome = true;
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
            System.out.println(input+" is a Palindrome");
        else
            System.out.println(input+"is not Palindrome");
    }
}