import java.util.Scanner;

public class PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) { // Base case: crossed or equal
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) { // Mismatch
            return false;
        }
        return isPalindromeRecursive(str, start + 1, end - 1); // Recursive call
    }

    public static void main(String[] args) {

        // ============================
        // UC9: Recursive Palindrome Checker
        // ============================
        Scanner sc = new Scanner(System.in);
        System.out.println("--- UC9: Recursive Palindrome Checker ---");
        System.out.print("Enter a string to check using recursion: ");
        String inputUC9 = sc.nextLine();

        if (isPalindromeRecursive(inputUC9, 0, inputUC9.length() - 1)) {
            System.out.println("The string '" + inputUC9 + "' is a palindrome (Recursive check).");
        } else {
            System.out.println("The string '" + inputUC9 + "' is NOT a palindrome (Recursive check).");
        }

        sc.close();
    }
}