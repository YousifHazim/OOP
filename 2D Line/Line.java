public class Line {

    private Vector vector = new Vector();
    private Point point = new Point();
    public Line(Vector vector , Point point)
    {
        this.vector = vector;
        this.point = point;
    }

    public Line(double vectorX , double vectorY , double pointX, double pointY)
    {
        vector.setX(vectorX);
        vector.setY(vectorY);
        point.setX(pointX);
        point.setY(pointY);
    }

    public void print(){
        point.printPoints();
        System.out.println("The Direction = "+ Math.atan(vector.getY()/vector.getX()));
    }
}
