import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ============================
        // UC6: Queue + Stack Based Palindrome Check
        // ============================
        Scanner sc = new Scanner(System.in);
        System.out.println("--- UC6: Queue + Stack Based Palindrome Check ---");
        System.out.print("Enter a string to check using queue and stack: ");
        String inputUC6 = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue into queue and push into stack
        for (int i = 0; i < inputUC6.length(); i++) {
            char ch = inputUC6.charAt(i);
            queue.add(ch);    // FIFO
            stack.push(ch);   // LIFO
        }

        // Compare dequeue vs pop
        boolean isPalindrome = true;
        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string '" + inputUC6 + "' is a palindrome (Queue+Stack check).");
        } else {
            System.out.println("The string '" + inputUC6 + "' is NOT a palindrome (Queue+Stack check).");
        }

        sc.close();
    }
}