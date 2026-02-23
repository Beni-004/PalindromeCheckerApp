public class PalindromeCheckerApp {
    public static void main(String[] args) {
    String input = "madam";
    String reversed = "";
    for(int i=input.length()-1; i>=0; i--){
        reversed+=input.charAt(i);
    }
    boolean isPalindrome =input.equals(reversed);
    System.out.println("Original String: "+input);
    System.out.println("Reversed String: "+reversed);
    System.out.println("Is it a Palindrome? "+isPalindrome);
    }
}
