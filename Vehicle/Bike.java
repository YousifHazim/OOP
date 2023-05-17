public class Bike extends Vehicle{

    public Bike() {
        super(200, 2);
    }

    @Override
    public void drive() {
        System.out.println("Bike");
        System.out.println(2);
    }
}
