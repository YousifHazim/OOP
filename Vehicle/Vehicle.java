public abstract class Vehicle {

    private float speed;
    private int numberOfWheels;

    public Vehicle(float speed, int numberOfWheels) {
        this.speed = speed;
        this.numberOfWheels = numberOfWheels;
    }

    public abstract void drive();

}
