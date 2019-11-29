import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        int n = 10;
        int number;
        int max;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter number : ");
        max = input.nextInt();
        for (int i = 0; i < n - 1; i++) {
            System.out.print("\nEnter number : ");
            number = input.nextInt();
            if (number > max)
                max = number;
        }
        System.out.println("The largest number is " + max);
    }
}
