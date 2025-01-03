public class WhileLoopChallenge {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenCount =0;
        int oddCount = 0;

        while (number <= finishNumber){
            number ++;
            if(! isEvenNumber(number)){
                oddCount++;
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++;
            if(evenCount >= 5) {
                break;
            }
        }

        System.out.println("Total number of odd numbers found = " + oddCount);
        System.out.println("Total number of Even numbers found = " + evenCount);
    }
    public static boolean isEvenNumber( int evenNum) {
        return evenNum % 2 == 0;
    }
}
