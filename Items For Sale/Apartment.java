
public class Apartment extends ItemsForSale {
    private double area;
    private int avgMeter;
    static private double Totalprice;
    static private double avgPrice;
    static private int counter;

    public static double avgPrice(){
        return avgPrice;
    }

    public Apartment() {
    }

    public Apartment(double area , String itemName, int price) {
        super(itemName, price);
        this.area = area;
        Totalprice += price;
        counter++;
        this.avgPrice = Totalprice/counter;
    }

    @Override
    public boolean isGoodDeal() {
        if (getPrice() < (avgMeter * area)) {
            return true;
        }
        return false;
    }
}
