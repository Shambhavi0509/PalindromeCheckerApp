import java.util.Scanner;
import java.util.Stack;

// ============================
// Palindrome Service Class (UC11)
// ============================
class PalindromeChecker {

    // Encapsulated palindrome logic
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        String normalized = input.toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters to stack
        for (int i = 0; i < normalized.length(); i++) {
            stack.push(normalized.charAt(i));
        }

        // Compare while popping
        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ============================
        // UC11: Object-Oriented Palindrome Service
        // ============================

        Scanner sc = new Scanner(System.in);
        System.out.println("--- UC11: Object-Oriented Palindrome Check ---");
        System.out.print("Enter a string to check using OOPS method: ");
        String inputUC11 = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(inputUC11);

        if (result) {
            System.out.println("The string '" + inputUC11 + "' is a palindrome.");
        } else {
            System.out.println("The string '" + inputUC11 + "' is NOT a palindrome.");
        }

        sc.close();
    }
}