import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ============================
        // UC10: Case-Insensitive & Space-Ignored Palindrome
        // ============================
        Scanner sc = new Scanner(System.in);
        System.out.println("--- UC10: Case-Insensitive & Space-Ignored Palindrome ---");
        System.out.print("Enter a string to check ignoring spaces and case: ");
        String inputUC10 = sc.nextLine();

        // Normalize string: remove spaces and convert to lowercase
        String normalized = inputUC10.replaceAll("\\s+", "").toLowerCase();

        // Reverse normalized string
        String reversed = new StringBuilder(normalized).reverse().toString();

        // Compare
        if (normalized.equals(reversed)) {
            System.out.println("The string '" + inputUC10 + "' is a palindrome (Case & Space Ignored).");
        } else {
            System.out.println("The string '" + inputUC10 + "' is NOT a palindrome (Case & Space Ignored).");
        }

        sc.close();
    }
}