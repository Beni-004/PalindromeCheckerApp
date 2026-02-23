public class PalindromeCheckerApp {
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }
    public static void main(String[] args) {
        String str = "racecar";
        str = str.replaceAll("\\s+", "").toLowerCase();
        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a palindrome!");
        } else {
            System.out.println(str + " is NOT a palindrome!");
        }
    }
}