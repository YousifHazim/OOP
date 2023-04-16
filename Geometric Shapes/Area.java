 public class Area {

    static double Rectangle( double width , double height )
    {
        double Area = width * height;
        return Area;
    }

     static double Square( double side )
    {
        double Area = side * side;
        return Area;
    }

     static double Circle( double radius )
    {
        double Area = 3.14 * Math.pow(radius,2);
        return Area;
    }

}
