
public abstract class ItemsForSale {
    private String itemName;
    private int price;

    public ItemsForSale(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    public ItemsForSale() {
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

    public abstract boolean isGoodDeal();

}
