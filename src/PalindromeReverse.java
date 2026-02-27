public class PalindromeReverse {
    public static void main(String[] args) {
        String input = "radar"; // Hardcoded string
        String reversed = "";

        // Key Concept: Loop (for loop) to iterate in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            // Key Concept: String Concatenation (+) to build the reversed string
            reversed = reversed + input.charAt(i);
        }

        // Key Concept: equals() Method to compare actual content
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}