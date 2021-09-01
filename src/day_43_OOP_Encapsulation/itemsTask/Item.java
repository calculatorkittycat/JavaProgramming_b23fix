package day_43_OOP_Encapsulation.itemsTask;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;

    static {

    }

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name = '" + name + '\'' +
                ", unitPrice = $" + unitPrice +
                ", quantity = " + quantity +
                ", total price = $" + calcCost() +
                '}';
    }
}
