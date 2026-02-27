public class PalindromeResult {
    public static void main(String[] args) {
        // String Literal - Text enclosed in double quotes
        String original = "madam";
        String reversed = "";

        // Logic to reverse the hardcoded string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Conditional Statement (if-else)
        if (original.equals(reversed)) {
            // Console Output - System.out.println()
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}