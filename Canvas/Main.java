import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Canvas canvas = new Canvas();

        canvas.addShape(new Line(new Point2D.Double(0,0),new Point2D.Double(2,2))); // Line
        canvas.addShape(new Rectangle(new Point2D.Double(3, 3), 25, 50));    // Rectangle
        canvas.addShape(new Ellipse(new Point2D.Double(-2, -2), 25, 50));    // Ellipse

        Shapes closest = canvas.getShape(new Point2D.Double(50, 50)); // get the closest Point

        System.out.println("Closest shape to (50, 50) is: " + closest.getStart());

        canvas.drawAll(); // Draw before removing the shape

        canvas.removerShape(closest);

        System.out.println("After removing closest shape:");

        canvas.drawAll(); // Draw after removing the shape

    }
}
