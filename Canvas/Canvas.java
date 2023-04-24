import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Canvas {
    private ArrayList<Shapes> shape;

    public Canvas(){
        shape = new ArrayList<>();
    }

    public void addShape(Shapes shape){
        this.shape.add(shape);
    }

    public void removerShape(Shapes shape){

        if (this.shape.contains(shape)) // if there is a similar shape
            this.shape.remove(shape);
        else
            System.out.println("The shape is not found");
    }

    public Shapes getShape(Point2D point){

        double distance;
        double minDistance = Double.MAX_VALUE;
        Shapes closestShape = null;

        for (Shapes shape : this.shape ){

            distance = shape.getStart().distance(point);
            if (distance < minDistance ){
                minDistance = distance;
                closestShape = shape;
            }
        }
        return closestShape;
    }

    public void drawAll(){
        for (Shapes shape : this.shape)
            shape.draw();
    }
}
