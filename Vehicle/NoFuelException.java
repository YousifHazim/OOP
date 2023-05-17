public class NoFuelException extends RuntimeException{

    public NoFuelException(String message , int fuelCapcity) {
        System.out.println(message);
        System.out.println(fuelCapcity);
    }
}
