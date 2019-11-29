import java.util.Scanner;

public class FindTheTwoLargestNumbers {
    public static void main(String[] args) {
        int n = 10;
        int number;
        int firstMax;
        int secondMax;
        firstMax = secondMax = Integer.MIN_VALUE;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter number : ");
            number = input.nextInt();
            if (number > firstMax) {
                secondMax = firstMax;
                firstMax = number;
            } else if (number > secondMax) {
                secondMax = number;
            }
        }
        System.out.println("The first max is " + firstMax);
        System.out.println("The second max is " + secondMax);
    }
}
