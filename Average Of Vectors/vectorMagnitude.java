public class vectorMagnitude {

     public double VectorMagnitudeAverage(  Vector [] array ) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i].magnitude();

        }
        return sum/array.length;
    }
}
