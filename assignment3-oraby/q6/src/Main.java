public class Main {
    public static void main(String[] args)
    {
        GroceryList oraby = new GroceryList();
        GroceryltemOrder item1 = new GroceryltemOrder("Orang",50);
        item1.setQuantity(10);
        oraby.add(item1);
        GroceryltemOrder item2 = new GroceryltemOrder("Apple",70);
        item2.setQuantity(20);
        oraby.add(item2);
        System.out.println(oraby.getTotalCost());

    }
}