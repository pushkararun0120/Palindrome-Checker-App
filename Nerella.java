public class UseCase4PalindromeCheckerApp {
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

        // Convert the string into a character array
        char[] chars = input2.toCharArray();

        // Initialize pointer at the beginning
        int start = 0;

        // Initialize pointer at the end
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isCharPalindrome = true;

        // Continue comparison until pointers cross
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
    }
}
