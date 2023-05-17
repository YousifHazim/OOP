import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    Vehicle[] vehicles = new Vehicle[2];

    vehicles[0] = new Car(100,4,10);
    vehicles[1] = new Bike();


    try {
        for (int i=0;i<3;i++){
            vehicles[0].drive();
        }

        for (int i=0;i<1;i++){
            vehicles[1].drive();
        }


    }catch (NoFuelException ex){
        System.out.println(ex.getMessage());
    }

    }
}
