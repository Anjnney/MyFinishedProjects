public class perfectNumber {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(75));
        System.out.println(isPerfectNumber(10));
        System.out.println(isPerfectNumber(9));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(28));
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number < 1) {
            return false;
        }

        for(int i = 1; i < number; i ++) {

            if(number % i == 0){

                sum +=i;
            }
        }

        return sum == number;
    }


}
