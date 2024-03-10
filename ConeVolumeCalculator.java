import java.util.Scanner;

public class ConeVolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the height of the cone: ");
        double height = scanner.nextDouble();
        
        System.out.print("Enter the radius of the cone: ");
        double radius = scanner.nextDouble();

        // Calculating the volume of the cone
        double volume = calculateConeVolume(height, radius);

        // Displaying the volume of the cone
        System.out.println("Volume of the cone: " + volume);

        scanner.close();
    }

    // Method to calculate the volume of a cone
    private static double calculateConeVolume(double height, double radius) {
        return (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}