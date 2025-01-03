public class FactorPrinter {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(300, 150));
        System.out.println(getGreatestCommonDivisor(99, 455));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1; // Invalid value
        }

        int gcd = 1; // Initialize the greatest common divisor
        int smaller = (first < second) ? first : second; // Determine the smaller number

            // Loop from 1 to the smaller number to find the greatest common divisor
        for (int i = 1; i <= smaller; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i; // Update gcd when both numbers are divisible by i
            }
        }

        return gcd;
    }
}
