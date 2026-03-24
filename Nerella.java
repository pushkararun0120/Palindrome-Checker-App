public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        // Display welcome message
        System.out.println("Palindrome Checker App");

        // Display application details
        System.out.println("Version: 1.0");
        System.out.println("Welcome to the Palindrome Checker Application!");

        // Flow continues (next use case or exit)
        System.out.println("Application is ready to proceed...");

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
    }
}
