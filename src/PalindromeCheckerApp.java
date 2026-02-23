import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ============================
        // UC3: Palindrome Check Using String Reverse (User Input)
        // ============================
        Scanner sc = new Scanner(System.in);
        System.out.println("--- UC3: Palindrome Check Using String Reverse ---");
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
