public class DigitSumChallenge {

    public static void main(String[] args) {

        System.out.println("The sum of the digits in number 1234 is " + sumDigit(1234));
        System.out.println("The sum of the digits in number 984 is " + sumDigit(984));
        System.out.println("The sum of the digits in number 9902 is " + sumDigit(9902));
        System.out.println("The sum of the digits in number -1234 is " + sumDigit(-1234));
    }
    public static int sumDigit( int digit) {

        if(digit < 0) {
            return -1;
        }
        int sum = 0;
        while(digit > 9) {
            sum += (digit % 10);
            digit = digit / 10;
        }
        sum += digit;
        return sum;
    }
}
