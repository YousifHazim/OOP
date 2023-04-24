import java.awt.geom.Point2D;

public class Rectangle extends Shapes{

    private double length;
    private double width;
    public Rectangle(Point2D start ,double length , double width){
        super(start);
        this.length = length;
        this.width = width;
    }

    public final double getLength(){
        return length;
    }

    public final double getWidth(){
        return width;
    }

    @Override
    public final void draw(){
        System.out.println("Start = " + this.getStart());
        System.out.println("Length = " + this.length);
        System.out.println("Width = " + this.width);
    }
}
