public class Perimeter {

    static double Rectangle( double width , double height )
    {
        double Perimeter = 2 * (width + height);
        return Perimeter;
    }

    static double Square( double side )
    {
        double Perimeter = 4 * side;
        return Perimeter;
    }

    static double Circle( double radius )
    {
        double Perimeter = 2 * 3.14 * radius;
        return Perimeter;
    }

}
