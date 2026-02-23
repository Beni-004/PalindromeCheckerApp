public class PalindromeCheckerApp {
    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node left;
    public static Node createLinkedList(String str) {
        if (str == null || str.length() == 0)
            return null;
        Node head = new Node(str.charAt(0));
        Node current = head;
        for (int i = 1; i < str.length(); i++) {
            current.next = new Node(str.charAt(i));
            current = current.next;
        }
        return head;
    }
    public static boolean isPalindrome(Node right) {
        if (right == null)
            return true;
        boolean result = isPalindrome(right.next);
        if (!result)
            return false;
        boolean isEqual = (left.data == right.data);
        left = left.next;
        return isEqual;
    }
    public static void main(String[] args) {
        String input = "racecar";
        Node head = createLinkedList(input);
        left = head;
        if (isPalindrome(head))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}