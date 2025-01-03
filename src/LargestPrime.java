public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(100));
        System.out.println(getLargestPrime(178));
        System.out.println(getLargestPrime(98));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1; // Return -1 for numbers less than or equal to 1 (invalid case)
        }

        int divisor = 2; // Start with the smallest prime number
        while (divisor <= number) {
            if (number % divisor == 0) {
                number /= divisor; // Divide the number by the current divisor
            } else {
                divisor++; // Move to the next potential factor
            }
        }

        return divisor; // The largest prime factor
    }
}
