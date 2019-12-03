import java.util.Scanner;

public class PrintingTheDecimalEquivalentOfABinaryNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter binary binaryNumber ");
        int binaryNumber = input.nextInt();

        int temp;
        int i = 0;
        double decimalNumber = 0.0;

        while (binaryNumber != 0){
            temp = binaryNumber % 10;
            decimalNumber += temp * Math.pow(2,i);
            binaryNumber = binaryNumber / 10;
            i++;
        }

        System.out.printf("\nDecimal equivalent is %.2f",decimalNumber);
    }
}
