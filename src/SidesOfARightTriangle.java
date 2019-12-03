import java.util.Scanner;

public class SidesOfARightTriangle {
    public static void main(String[] args) {

        System.out.println("Enter the sides of right triangle: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side ");
        int a = input.nextInt();
        System.out.print("Enter second side ");
        int b = input.nextInt();
        System.out.print("Enter third side ");
        int c = input.nextInt();

        if ((a > 0) && (b > 0) && (c > 0) &&
                ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) ||
                (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) ||
                (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)))) {
            System.out.printf("%d, %d and  %d represent the sides of  right triange", a, b, c);
        } else {
            System.out.printf("%d, %d and  %d does not represent the sides of  right triange", a, b, c);
        }
    }
}
