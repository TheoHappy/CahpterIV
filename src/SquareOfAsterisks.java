import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        int sizeOfTheSide;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the side of a square :");
        sizeOfTheSide = input.nextInt();

        for (int i = 0; i < sizeOfTheSide; i++) {
            System.out.print("*");

        }

        System.out.println();

        for (int i = 0; i < sizeOfTheSide - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < sizeOfTheSide - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < sizeOfTheSide; i++) {
            System.out.print("*");
        }

    }
}
