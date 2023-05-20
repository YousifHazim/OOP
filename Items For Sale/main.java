
public class Main {
    public static void main(String[] args) {

        ItemsForSale[] items = new ItemsForSale[5];

        items[0] = new Apartment(50, "first", 900000);
        items[1] = new Apartment(100, "second", 700000);
        items[2] = new Apartment(150, "third", 4000);
        items[3] = new Apartment(200,"fourth", 20000);
        items[4] = new Apartment(250, "fifth", 1000);

        for (int i = 0; i < items.length; i++) {
            System.out.println("The Salary : " + i + " " + items[i].isGoodDeal());

        }

        System.out.println("The Avg = "+Apartment.avgPrice());
    }
}
