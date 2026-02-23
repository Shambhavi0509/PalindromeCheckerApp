import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ============================
        // UC5: Stack-Based Palindrome Checker
        // ============================
        Scanner sc = new Scanner(System.in);
        System.out.println("--- UC5: Stack-Based Palindrome Checker ---");
        System.out.print("Enter a string to check using stack method: ");
        String inputUC5 = sc.nextLine();

        // Create a stack and push all characters of the string
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < inputUC5.length(); i++) {
            stack.push(inputUC5.charAt(i));
        }

        // Pop characters from stack to get reversed string
        String reversedWithStack = "";
        while (!stack.isEmpty()) {
            reversedWithStack += stack.pop();
        }

        // Compare original string with reversed string
        if (inputUC5.equals(reversedWithStack)) {
            System.out.println("The string '" + inputUC5 + "' is a palindrome.");
        } else {
            System.out.println("The string '" + inputUC5 + "' is NOT a palindrome.");
        }

        sc.close();
    }
}