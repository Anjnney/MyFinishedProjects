public class NumberPalindrome {

    public static void main(String[] args) {


    }
    public static boolean isPalindrome(int number) {
        int originalNumber = number; // Store the original number for comparison
        int reverse = 0;

        // Make the number positive for processing
        number = Math.abs(number);

        // Reverse the number
        while (number > 0) {
            int lastDigit = number % 10;  // Extract the last digit
            reverse = (reverse * 10) + lastDigit; // Build the reverse number
            number = number / 10; // Remove the last digit
        }

        // Compare the reversed number with the original number
        return reverse == Math.abs(originalNumber);
    }
}