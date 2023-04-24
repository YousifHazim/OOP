import java.awt.geom.Point2D;

public class Line extends Shapes {

    private Point2D end;

    public Line(Point2D start , Point2D end){
        super(start);
        this.end = end;
    }

    public final Point2D getEnd(){
        return end;
    }

    @Override
    public final void draw(){
        System.out.println("Start = " + this.getStart());
        System.out.println("End = " + this.end);
    }
}
