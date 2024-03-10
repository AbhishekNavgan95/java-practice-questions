// get squares and cubes of numbers from 1 - 100
public class PrintSquaresAndCubes {
    public static void main(String[] args) {

        System.out.println("Squares and cubes of numbers from 1 to 100 : ");

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " Square : " + getSquare(i) + " Cube : " + getCube(i));
        }

    }

    public static int getSquare(int i) {
        return i * i;
    }

    public static int getCube(int i) {
        return (i * i * i);
    }

}
