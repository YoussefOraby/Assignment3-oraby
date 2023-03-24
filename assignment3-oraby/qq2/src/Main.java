import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> oraby = new ArrayList<Integer>(5);
        oraby.add(10);
        oraby.add(50);
        oraby.add(5);
        oraby.add(8);
        oraby.add(88);
        oraby.add(70);
        int max = max(oraby);
        System.out.println( max);

    }
    public static Integer max(ArrayList<Integer> list){
        int max=0;
        if(list.size()==0)
            return null;
        for(var x : list){
            if(x>max)
                max = x;
        }
        return max;
    }
}
