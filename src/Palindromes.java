import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userInput;

        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter your 5 digit number: ");
            userInput = input.next();
            if (userInput.length() == 5) {
                try {
                    number = Integer.parseInt(userInput);
                    if (number > 0) {
                        isValid = true;
                    }
                } catch (NumberFormatException e) {
                }
            }
        }

        int reverseNumber = 0;
        int temp = number;

        while (temp != 0) {

            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + temp % 10;
            temp = temp / 10;
        }

        if (number == reverseNumber)
            System.out.printf("%d is palindrom", number);
        else
            System.out.printf("%d isn't palindrom", number);
    }
}
