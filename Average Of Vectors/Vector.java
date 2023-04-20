public class Vector {

    private double vectorX , vectorY;

    Vector(){
        vectorX = 0 ;
        vectorY = 0 ;
    }

    Vector(double x , double y){
        vectorX = x ;
        vectorY = y ;
    }

    public double getX()
    {
        return vectorX;
    }

    public double getY()
    {
        return vectorY;
    }

    public void setX(double x)
    {
        vectorX = x;
    }

    public void setY(double y)
    {
        vectorY = y;
    }

    public double magnitude()
    {
        double magnitude = Math.sqrt(Math.pow(vectorX,2)+Math.pow(vectorY,2));
        return magnitude;
    }

    public double angle()
    {
        double angle = Math.toDegrees(Math.atan(vectorY/vectorX));
        return angle;
    }

    public void print()
    {
        System.out.println("The Vector :" + vectorX + " i + " + vectorY + " j");
        System.out.println("The Magnitude :" + magnitude());
        System.out.println("The Angle :" + angle());
    }

    public Vector add(Vector passedVector)
    {
        Vector result = new Vector();
        result.setY(this.getY() + passedVector.getY());
        result.setX(this.getX() + passedVector.getX());
        return result;
    }

    public Vector sub(Vector passedVector)
    {
        Vector result = new Vector();
        result.setY(this.getY() - passedVector.getY());
        result.setX(this.getX() - passedVector.getX());
        return result;
    }


}
