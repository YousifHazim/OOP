
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            /* Question One */

        System.out.println("Question One: ");

        Scanner input = new Scanner(System.in);

        Vector vectorTest = new Vector();

        System.out.println("Enter The Value of X coordinate :");
        double xCurrent = input.nextDouble(); // Get Value For x from user

        System.out.println("Enter The Value of Y coordinate :");
        double yCurrent = input.nextDouble(); // Get Value For y from user

        vectorTest.setX(xCurrent); // Set Value X
        vectorTest.setY(yCurrent); // Set Value Y

        System.out.println("The X Cordination = " + vectorTest.getX()); 
// Get Value X
        System.out.println("The Y Cordination = " +vectorTest.getY()); 
// Get Value Y

        vectorTest.print();

        System.out.println("Please Enter The X and Y Coordination for Passed Vector");

        System.out.println("Enter The Value of X coordinate :");
        double xPassed = input.nextDouble(); // Get Value For x from user

        System.out.println("Enter The Value of Y coordinate :");
        double yPassed = input.nextDouble(); // Get Value For y from user

        Vector vectorPassed = new Vector(xPassed,yPassed);
        Vector result = new Vector();

        result = vectorTest.add(vectorPassed);
        System.out.println("The Answer of Add the two vectors = ");
        result.print();
        result = vectorTest.sub(vectorPassed);
        System.out.println("The Answer of Sub the two vectors = ");
        result.print();

       
      /* Question Two */

        System.out.println("Question 2: ");

        System.out.println("The Average of The Vectors : ");

        System.out.println("Vector 1 : 3i + 4j");
        System.out.println("Vector 2 : 6i + 8j");
        System.out.println("Vector 3 : 9i + 12j");

        Vector [] array = new Vector[3];

        array [0] = new Vector(3,4);
        array [1] = new Vector(6,8);
        array [2] = new Vector(9,12);

        vectorMagnitude Average = new vectorMagnitude();

        System.out.println("The Average = " + Average.VectorMagnitudeAverage(array));

    }
}
