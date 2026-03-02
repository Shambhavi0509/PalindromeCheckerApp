import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

// ============================
// Palindrome Strategy Interface (UC12)
// ============================
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

// ============================
// Stack Strategy Implementation
// ============================
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        String normalized = input.toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < normalized.length(); i++) {
            stack.push(normalized.charAt(i));
        }

        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// ============================
// Deque Strategy Implementation
// ============================
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        String normalized = input.toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : normalized.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ============================
        // UC12: Strategy Pattern for Palindrome Algorithms
        // ============================

        Scanner sc = new Scanner(System.in);
        System.out.println("--- UC12: Strategy Pattern Palindrome Check ---");
        System.out.print("Enter a string: ");
        String inputUC12 = sc.nextLine();

        System.out.println("Choose Algorithm:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = sc.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.checkPalindrome(inputUC12);

        if (result) {
            System.out.println("The string '" + inputUC12 + "' is a palindrome.");
        } else {
            System.out.println("The string '" + inputUC12 + "' is NOT a palindrome.");
        }

        sc.close();
    }
}