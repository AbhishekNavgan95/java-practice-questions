// program to print X pattern
public class PrintXPattern {
    public static void main(String[] args) {
        int size = 7;

        printXPattern(size);
    }

    private static void printXPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == i || j == (size - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}