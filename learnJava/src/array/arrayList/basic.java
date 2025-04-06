package array.arrayList;

import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        //int[] arr  = { 1, 2, 3, 4, 5, }
        ArrayList<Integer> arr = new ArrayList<>(6);
       // 6 is the capacity and not array size until you give your array value
        arr.add(0, 1); // arr[0] = 10
        arr.add(1, 10);// initialize
        arr.add(2, 100);
        arr.add(3, 1000);
        arr.add(4, 10000);
        arr.add(5, 100000);
        
        System.out.println(arr.get(0));//output of an arrayList 
        
        for (int i = 0; i<arr.size(); i++) {
            System.out.print(arr.get(i)+ " ");
        }
        System.out.println();
        System.out.println(arr);

        // to change value
        arr.set(3, 3000);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+ " ");
        }
        
        arr.add(90); //push back
        System.out.println();
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+ " ");
        }
        System.out.println("\n" + "size " +arr.size());

        
    }

}
