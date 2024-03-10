import java.util.Scanner;

public class DecimalToHexadecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Converting decimal to hexadecimal
        String hexadecimal = convertDecimalToHexadecimal(decimal);

        // Displaying the hexadecimal representation
        System.out.println("Hexadecimal representation: " + hexadecimal);

        scanner.close();
    }

    // Method to convert decimal to hexadecimal
    private static String convertDecimalToHexadecimal(int decimal) {
        // Using Integer.toHexString() method for conversion
        return Integer.toHexString(decimal).toUpperCase();
    }
}
