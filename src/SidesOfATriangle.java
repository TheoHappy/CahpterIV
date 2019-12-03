import java.util.Scanner;

public class SidesOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side ");
        int a = input.nextInt();
        System.out.print("Enter second side ");
        int b = input.nextInt();
        System.out.print("Enter third side ");
        int c = input.nextInt();

        if ((a > 0) && (b > 0) && (c > 0) && (a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.printf("%d, %d and %d represent the sides of triange", a, b, c);
        } else {
            System.out.printf("%d, %d and %d does not represent the sides of triange", a, b, c);

        }
    }
}
