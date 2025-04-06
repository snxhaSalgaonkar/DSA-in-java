package array.arrayList;

import java.util.ArrayList;

public class basic2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " " + list.size());
        
        list.add(60);
        System.out.println(list + " " + list.size());
        list.add(56);
        System.out.println(list + " " + list.size());
        System.out.println(list);
        
        list.remove(0);
        System.out.println(list + " " + list.size());

    }

}
