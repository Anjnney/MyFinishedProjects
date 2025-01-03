public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(747));
        System.out.println(sumFirstAndLastDigit(673));

    }
    public static int sumFirstAndLastDigit(int number) {
        // Check if the number is negative
        if (number < 0) {
            return -1;
        }

        // Get the last digit
        int lastDigit = number % 10;

        // Find the first digit
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10; // Divide firstDigit by 10 until it's a single digit
        }

        // Return the sum of the first and last digit
        return firstDigit + lastDigit;
    }
}