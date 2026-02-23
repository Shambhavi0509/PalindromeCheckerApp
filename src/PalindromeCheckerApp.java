import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ============================
        // UC4: Character Array Based Palindrome Check
        // ============================
        Scanner sc = new Scanner(System.in);
        System.out.println("--- UC4: Character Array Based Palindrome Check ---");
        System.out.print("Enter a string to check using character array method: ");
        String inputUC4 = sc.nextLine();

        char[] charArray = inputUC4.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("The string '" + inputUC4 + "' is a palindrome.");
        } else {
            System.out.println("The string '" + inputUC4 + "' is NOT a palindrome.");
        }

        sc.close();
    }
}
