import java.awt.geom.Point2D;
import java.lang.Comparable;
import java.util.Arrays;

public class Diamond extends Shapes implements Moveable , Comparable<Diamond>{

    private double Length,Width;
    private Point2D start;
    public Diamond(Point2D start , double Length , double Width){
        super(start);
        this.Length = Length;
        this.Width = Width;
    }

    public final double getLength(){
        return Length;
    }

    public final double getWidth(){
        return Width;
    }

    @Override
    public final void draw(){
        System.out.println("Start ="+this.getStart());
        System.out.println("Length ="+this.Length);
        System.out.println("Width ="+this.Width);
    }

    @Override
    public final void move(double dx , double dy){
        setStart(getStart().getX()+dx,getStart().getY()+dy);
    }

    @Override
    public int compareTo(Diamond object){

        if (this.getStart().getX() > object.getStart().getX())
            return 1;
        else if (this.getStart().getX() < object.getStart().getX())
            return -1;

        else {

            if (this.getStart().getY() > object.getStart().getY())
                return 1;
            else if (this.getStart().getY() < object.getStart().getY())
                return -1;
            else return 0;
        }

    }

}
