import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase12PalindromeCheckerApp {
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

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();

        for (char c : input4.toCharArray()) {
            queue.add(c);
            stack2.push(c);
        }

        boolean isQueueStackPalindrome = true;

        while (!queue.isEmpty()) {
            if (queue.poll() != stack2.pop()) {
                isQueueStackPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input4);
        System.out.println("Is Palindrome? : " + isQueueStackPalindrome);

        // UC7: Deque-Based Optimized Palindrome Checker
        String input5 = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input5.toCharArray()) {
            deque.addLast(c);
        }

        boolean isDequePalindrome = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isDequePalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input5);
        System.out.println("Is Palindrome? : " + isDequePalindrome);

        // UC8: Linked List Based Palindrome Checker
        String input6 = "level";

        LinkedList<Character> list = new LinkedList<>();

        for (char c : input6.toCharArray()) {
            list.add(c);
        }

        boolean isLinkedListPalindrome = true;

        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                isLinkedListPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input6);
        System.out.println("Is Palindrome? : " + isLinkedListPalindrome);

        // UC9: Recursive Palindrome Checker
        String input7 = "madam";

        boolean isRecursivePalindrome = check(input7, 0, input7.length() - 1);

        System.out.println("Input : " + input7);
        System.out.println("Is Palindrome? : " + isRecursivePalindrome);

        // UC10: Case-Insensitive & Space-Ignored Palindrome
        String input8 = "A man a plan a canal Panama";

        String normalized = input8.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isNormalizedPalindrome = true;

        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isNormalizedPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input8);
        System.out.println("Is Palindrome? : " + isNormalizedPalindrome);

        // UC11: Object-Oriented Palindrome Service
        String input9 = "racecar";

        PalindromeService service = new PalindromeService();
        boolean isOOPPalindrome = service.checkPalindrome(input9);

        System.out.println("Input : " + input9);
        System.out.println("Is Palindrome? : " + isOOPPalindrome);

        // UC12: Strategy Pattern for Palindrome Algorithms
        String input10 = "level";

        // Inject StackStrategy at runtime
        PalindromeStrategy strategy = new StackStrategy();
        boolean isStrategyPalindrome = strategy.check(input10);

        System.out.println("Input : " + input10);
        System.out.println("Is Palindrome? : " + isStrategyPalindrome);
    }

    private static boolean check(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return check(s, start + 1, end - 1);
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

/**
 * INTERFACE - PalindromeStrategy
 * This interface defines a contract for all
 * palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 * This class provides a Stack based implementation
 * of the PalindromeStrategy interface.
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
