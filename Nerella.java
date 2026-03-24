import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {

        // Display welcome message
        System.out.println("Palindrome Checker App");

        // Display application details
        System.out.println("Version: 1.0");
        System.out.println("Welcome to the Palindrome Checker Application!");

        // Flow continues (next use case or exit)
        System.out.println("Application is ready to proceed...");

        // UC2: Hardcoded Palindrome Check
        String input = "madam";

        System.out.println("Input text: " + input);

        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        // UC3: Palindrome Check Using String Reverse
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        boolean isReversePalindrome = input.equals(reversed);

        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome (Reverse Check)? : " + isReversePalindrome);

        // UC4: Character Array Based Palindrome Check
        String input2 = "radar";

        char[] chars = input2.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isCharPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isCharPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input : " + input2);
        System.out.println("Is Palindrome? : " + isCharPalindrome);

        // UC5: Stack-Based Palindrome Checker
        String input3 = "noon";

        Stack<Character> stack = new Stack<>();

        for (char c : input3.toCharArray()) {
            stack.push(c);
        }

        boolean isStackPalindrome = true;

        for (char c : input3.toCharArray()) {
            if (c != stack.pop()) {
                isStackPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input3);
        System.out.println("Is Palindrome? : " + isStackPalindrome);

        // UC6: Queue + Stack Based Palindrome Check
        String input4 = "civic";

        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO order
        Stack<Character> stack2 = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input4.toCharArray()) {
            queue.add(c);
            stack2.push(c);
        }

        // Flag to track palindrome status
        boolean isQueueStackPalindrome = true;

        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            if (queue.poll() != stack2.pop()) {
                isQueueStackPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input4);
        System.out.println("Is Palindrome? : " + isQueueStackPalindrome);
    }
}
