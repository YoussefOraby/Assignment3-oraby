import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(50);
        list.add(15);
        list.add(8);
        list.add(1);
        list.add(20);
        sort(list);
        for(var x:list)
            System.out.println(x);
    }
    public static void sort(ArrayList<Integer> list) {
        int temp;
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i) > list.get(j)) {
                    temp = list.get(i);
                    list.set (i,list.get(j));
                    list.set (j,temp);
                }
            }
        }
    }
    }
