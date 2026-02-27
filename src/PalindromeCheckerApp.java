import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // UC1: Add welcome message module
        System.out.println("--- Welcome to the Palindrome Checker ---");

        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String text) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}