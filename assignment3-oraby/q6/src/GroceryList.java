import java.util.ArrayList;

public class GroceryList{
    int nof=0;
    ArrayList<GroceryltemOrder> list = new ArrayList<GroceryltemOrder>(10);
    public GroceryList(){}
    public void add(GroceryltemOrder item){
        if(list.size()<=10)
            list.add(item);
        nof++;
    }
    public double getTotalCost(){
        double total = 0;
        for(int i=0;i<list.size();i++)
            total+=list.get(i).getCost();
        return total;
    }
}
