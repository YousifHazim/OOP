public class Car extends Vehicle{

    private int fuelCapcity;

    public Car(int fuelCapcity) {
        super();
        this.fuelCapcity = fuelCapcity;
    }

    public Car(float speed, int numberOfWheels, int fuelCapcity) {
        super(speed, numberOfWheels);
        this.fuelCapcity = fuelCapcity;
    }

    @Override
    public void drive() {

        if(fuelCapcity < 5)
            throw new NoFuelException("it is low fuel" , fuelCapcity);

        fuelCapcity -= 5;
        System.out.println(fuelCapcity);

    }
}
