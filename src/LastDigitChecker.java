public class LastDigitChecker {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(384,937,9835));
        System.out.println(hasSameLastDigit(498,97,98));
        System.out.println(hasSameLastDigit(639,908,89));

    }

    public static boolean hasSameLastDigit(int num1,int num2,int num3) {
        if ((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)) {
            return false;
        }
            int rightdigit1 = num1 % 10;
            int rightdigit2 = num2 % 10;
            int rightdigit3 = num3 % 10;

        return (rightdigit1 == rightdigit2) || (rightdigit1 == rightdigit3) || (rightdigit2 == rightdigit3);
    }
}

