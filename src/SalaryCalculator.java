import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many employers you have?");
        int nrOfEmp = input.nextInt();
        int numberOfHours;
        int hourlyRates;
        double grossPay;
        for (int i = 0; i < nrOfEmp; i++){
            System.out.print("\nNumber of hours = ");
            numberOfHours = input.nextInt();
            System.out.print("\nHourly rate = ");
            hourlyRates = input.nextInt();

            if (numberOfHours > 40)
                grossPay = (double)(40 * hourlyRates)+(numberOfHours-40)*hourlyRates*1.5;
            else
                grossPay = numberOfHours * hourlyRates;
            System.out.printf("\nEmployee’s gross pay is %.2f", grossPay);
        }
    }
}
