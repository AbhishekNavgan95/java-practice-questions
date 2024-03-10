// write a java program to take two values from user and print LCM
import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Closing scanner to prevent resource leak
        scanner.close();

        // Calculating LCM
        int lcm = calculateLCM(num1, num2);

        // Displaying LCM
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    // Method to calculate LCM using Euclidean algorithm
    private static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    // Method to calculate Greatest Common Divisor (GCD) using Euclidean algorithm
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
