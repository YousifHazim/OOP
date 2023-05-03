import java.awt.*;
import java.awt.geom.Point2D;
import java.lang.Comparable;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        /* Task One */

        Diamond diamond = new Diamond(new Point2D.Double(1.2,1.2),2,2);
        diamond.draw(); // Just Draw

        diamond.move(3,3);
        diamond.draw(); // Draw after move

        Diamond diamond1 = new Diamond(new Point2D.Double(1.2,1.2),2,2);
        System.out.println("The Compare Output is " + diamond.compareTo(diamond1)); // Compare = 1

        /* Task Two */

        Moveable[] moveable = new Moveable[3];

        moveable[0] = new Diamond(new Point2D.Double(2,2),2,2);
        moveable[1] = new Diamond(new Point2D.Double(1,1),1,1);
        moveable[2] = new Diamond(new Point2D.Double(3,3),3,3);

        for (Moveable mv : moveable) // Draw the three Arrays Before the move
            ((Diamond) mv).draw();

        for (Moveable mv : moveable) // Move The three Arrays
            mv.move(4,4);

        for (Moveable mv : moveable) // Draw the three Arrays After the move
            ((Diamond) mv).draw();


        Arrays.sort(moveable); // Sort the Arrays

        for (Moveable mv : moveable) // Draw the three Arrays After the sort
            ((Diamond) mv).draw();
    }
}
