// write a java program to print reverse pyramid pattern
import java.util.Scanner;

public class ReversePyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Printing the reverse pyramid pattern
        printReversePyramid(rows);

        scanner.close();
    }

    // Method to print reverse pyramid pattern
    private static void printReversePyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            // Printing spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Printing stars
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}