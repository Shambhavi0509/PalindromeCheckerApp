import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1: Welcome Message
        System.out.println("=======================================");
        System.out.println("   Welcome to Palindrome Checker App   ");
        System.out.println("          Version 1.0.0               ");
        System.out.println("=======================================");

        System.out.println("Program will continue to next use case or exit.");
        System.out.println();

        // UC2: Hardcoded Palindrome Check
        String word = "madam"; // hardcoded string
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("The word '" + word + "' is a palindrome.");
        } else {
            System.out.println("The word '" + word + "' is NOT a palindrome.");
        }

        System.out.println("\n--- UC3: Palindrome Check Using String Reverse (User Input) ---");

        // UC3: Palindrome Check Using String Reverse
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String userInput = sc.nextLine();

        String reversedInput = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversedInput += userInput.charAt(i);
        }

        if (userInput.equals(reversedInput)) {
            System.out.println("The string '" + userInput + "' is a palindrome.");
        } else {
            System.out.println("The string '" + userInput + "' is NOT a palindrome.");
        }

        sc.close();
    }
}