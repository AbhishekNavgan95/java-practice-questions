import java.util.Scanner;

public class TriangleStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Printing the triangle star pattern
        printTriangle(rows);

        scanner.close();
    }

    // Method to print triangle star pattern
    private static void printTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Printing stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
