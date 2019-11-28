import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        double avg;
        int mile;
        int gallon;
        Scanner input = new Scanner(System.in);

        double totalAvg = 0;
        do {
            System.out.println("\nEnter the miles driven or -1 for exit ");
            mile = input.nextInt();
            if (mile == -1)
                continue;
            System.out.println("\nEnter the gallons used");
            gallon = input.nextInt();

            avg = (double) mile / gallon;
            totalAvg = totalAvg + avg;
            System.out.printf("\nMiles per gallon is %.2f", avg);
        } while (mile != -1);
        System.out.printf("Miles per gallon for all trips is %.2f",totalAvg);
    }
}
