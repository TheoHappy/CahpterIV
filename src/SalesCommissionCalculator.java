import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double itemValue;
        double earnings;

        do {
            System.out.println("\nEnter item value or -1 for exit ");
            itemValue = input.nextDouble();
            earnings = 200 + itemValue * 0.09;
            if(itemValue == -1)
                continue;
            System.out.printf("\nSeller earning %.2f $", earnings);
        } while (itemValue != -1);
    }
}
