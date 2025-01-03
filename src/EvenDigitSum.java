public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(97465));
        System.out.println(getEvenDigitSum(398475));
    }



        public static int getEvenDigitSum(int number) {
            if (number < 0) {
                return -1; // Return -1 for invalid input (negative numbers)
            }

            int sum = 0; // Initialize sum for even digits

            while (number > 0) {
                int digit = number % 10; // Extract the last digit
                if (digit % 2 == 0) { // Check if the digit is even
                    sum += digit; // Add the even digit to the sum
                }
                number /= 10; // Remove the last digit
            }

            return sum; // Return the sum of even digits
        }
    }


