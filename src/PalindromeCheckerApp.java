import java.util.Scanner;

public class PalindromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // ============================
        // UC8: Linked List Based Palindrome Checker
        // ============================
        Scanner sc = new Scanner(System.in);
        System.out.println("--- UC8: Linked List Based Palindrome Checker ---");
        System.out.print("Enter a string to check using linked list: ");
        String inputUC8 = sc.nextLine();

        // Step 1: Convert string to linked list
        Node head = null;
        Node tail = null;
        for (int i = 0; i < inputUC8.length(); i++) {
            Node newNode = new Node(inputUC8.charAt(i));
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Step 2: Find middle using fast and slow pointer
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 3: Reverse second half of the list
        Node prev = null;
        Node current = slow;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        Node secondHalfHead = prev;

        // Step 4: Compare first half and reversed second half
        Node firstHalfPointer = head;
        Node secondHalfPointer = secondHalfHead;
        boolean isPalindrome = true;
        while (secondHalfPointer != null) {
            if (firstHalfPointer.data != secondHalfPointer.data) {
                isPalindrome = false;
                break;
            }
            firstHalfPointer = firstHalfPointer.next;
            secondHalfPointer = secondHalfPointer.next;
        }

        // Step 5: Output result
        if (isPalindrome) {
            System.out.println("The string '" + inputUC8 + "' is a palindrome (Linked List check).");
        } else {
            System.out.println("The string '" + inputUC8 + "' is NOT a palindrome (Linked List check).");
        }

        sc.close();
    }
}