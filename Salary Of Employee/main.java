import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    WagesInterface[] Employee = new WagesInterface[3];

    Employee[0] = new PartTimeEmployee(30,30);
    Employee[1] = new FullTimeEmployee(40);
    Employee[2] = new PartTimeEmployee(50,60);

    for (int i=0;i<3;i++){
        Employee[i].displayInfo();
    }

    }
}
