public class GroceryltemOrder {
    String name;
    int quantity;
    double price;
    public GroceryltemOrder (String name, double pricePerUnit){
        this.name=name;
        this.price = pricePerUnit;
    }
    public double getCost(){
        return price*quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

}
