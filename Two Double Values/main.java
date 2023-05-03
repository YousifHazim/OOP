import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double firstNumber=0,secondNumber=0;

        boolean continueInput = false;

        Scanner input = new Scanner(System.in);

        do {
            try {
                System.out.printf("Please Enter The First Number : "); // Take the first number
                firstNumber = input.nextDouble();
                System.out.printf("Please Enter The Second Number : "); // Take the second number
                secondNumber = input.nextDouble();

                twoNumber numbers = new twoNumber(firstNumber,secondNumber); // Make an object
                System.out.println("The Sum = "+numbers.Sum()); // Print The Sum
                System.out.println("The Difference = "+numbers.Difference()); // Print The Difference
                System.out.println("The Product = "+numbers.Product()); // Print The Product
                System.out.println("The Quotient = "+numbers.Quotient()); // Print The Quotient
                System.out.println("The Remainder = "+numbers.Remainder()); // Print The Remainder

                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Incorrect input: an double is required");
                input.nextLine(); // discard input
                continueInput = true;
            }
        } while (continueInput);

    }
}
