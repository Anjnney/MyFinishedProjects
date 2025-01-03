public class FlourPacker {

    public static void main(String[] args) {

        System.out.println(canPack(10,5, 20));
        System.out.println(canPack(10,5, 10));
        System.out.println(canPack(6,5, 40));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false; // Return false if any parameter is negative
        }

        int bigBagWeight = 5;

        // Use as many big bags as possible without exceeding the goal
        int maxBigBagsToUse = goal / bigBagWeight;
        if (maxBigBagsToUse > bigCount) {
            maxBigBagsToUse = bigCount;
        }

        // Calculate the remaining weight after using the big bags
        int remainingWeight = goal - (maxBigBagsToUse * bigBagWeight);

        // Check if we can fulfill the remaining weight with small bags
        return remainingWeight <= smallCount;
    }
}
