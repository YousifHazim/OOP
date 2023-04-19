import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter How many Values will you insert :");
        int arraySize = input.nextInt();

        int array[] = new int[10];

        System.out.println("Please Enter The Value to be Summation");

        for (int i=0;i<arraySize;i++) // Put the Values in Arrays
        {
            array[i] = input.nextInt();
        }

        System.out.println(getTheSum(array)); // Print The Sum of the Array

    }

    public static int getTheSum(int [] array)
    {
        int sumOfTheArray = 0;

        for (int i=0;i<array.length;i++)
        {
            sumOfTheArray += array[i];
        }
        return sumOfTheArray;
    }
}
