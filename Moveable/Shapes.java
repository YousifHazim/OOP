import java.awt.geom.Point2D;

public abstract class Shapes {

    private Point2D start;

    public Shapes(Point2D start){
        this.start = start;
    }

    public final Point2D getStart(){
        return start;
    }

    public final void setStart(double x , double y) {
        start.setLocation(x,y);
    }

    public abstract void draw();

}
