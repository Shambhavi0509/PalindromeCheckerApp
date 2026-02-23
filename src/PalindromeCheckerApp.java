import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ============================
        // UC7: Deque-Based Optimized Palindrome Checker
        // ============================
        Scanner sc = new Scanner(System.in);
        System.out.println("--- UC7: Deque-Based Optimized Palindrome Checker ---");
        System.out.print("Enter a string to check using deque: ");
        String inputUC7 = sc.nextLine();

        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < inputUC7.length(); i++) {
            deque.addLast(inputUC7.charAt(i));
        }

        // Compare front and rear characters
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string '" + inputUC7 + "' is a palindrome (Deque check).");
        } else {
            System.out.println("The string '" + inputUC7 + "' is NOT a palindrome (Deque check).");
        }

        sc.close();
    }
}