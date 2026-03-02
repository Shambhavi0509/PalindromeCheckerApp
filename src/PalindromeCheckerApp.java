import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    // ============================
    // Stack Method
    // ============================
    public static boolean checkUsingStack(String input) {

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

    // ============================
    // Deque Method
    // ============================
    public static boolean checkUsingDeque(String input) {

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

    public static void main(String[] args) {

        // ============================
        // UC13: Performance Comparison
        // ============================

        Scanner sc = new Scanner(System.in);
        System.out.println("--- UC13: Performance Comparison ---");
        System.out.print("Enter a string: ");
        String inputUC13 = sc.nextLine();

        // Stack timing
        long startStack = System.nanoTime();
        boolean stackResult = checkUsingStack(inputUC13);
        long endStack = System.nanoTime();
        long stackTime = endStack - startStack;

        // Deque timing
        long startDeque = System.nanoTime();
        boolean dequeResult = checkUsingDeque(inputUC13);
        long endDeque = System.nanoTime();
        long dequeTime = endDeque - startDeque;

        System.out.println("\nResults:");
        System.out.println("Stack Method: " + (stackResult ? "Palindrome" : "Not Palindrome"));
        System.out.println("Execution Time (Stack): " + stackTime + " ns");

        System.out.println("\nDeque Method: " + (dequeResult ? "Palindrome" : "Not Palindrome"));
        System.out.println("Execution Time (Deque): " + dequeTime + " ns");

        sc.close();
    }
}