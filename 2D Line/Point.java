public class Point {
    private double pointX , pointY;

    Point(){
        pointX = 0 ;
        pointY = 0 ;
    }

    Point(double x , double y){
        pointX = x ;
        pointY = y ;
    }

    public double getX()
    {
        return pointX;
    }

    public double getY()
    {
        return pointY;
    }

    public void setX(double x)
    {
        pointX = x;
    }

    public void setY(double y)
    {
        pointY = y;
    }

    public void printPoints()
    {
        System.out.println("X = " + pointX + " Y = " + pointY);
    }
}
