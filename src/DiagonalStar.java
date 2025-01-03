public class DiagonalStar {

    public static void main(String[] args) {

        printSquareStar(10);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        // Outer loop for rows
        for (int row = 1; row <= number; row++) {
            // Inner loop for columns
            for (int col = 1; col <= number; col++) {
                // Conditions to print stars
                if (row == 1 || row == number || col == 1 || col == number || row == col || col == (number - row + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
