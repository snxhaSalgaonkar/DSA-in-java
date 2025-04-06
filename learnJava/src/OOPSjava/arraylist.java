package OOPSjava;

import java.util.Arrays;

//import java.util.ArrayList;

public class arraylist {
    public static class Arraylist{

        int[] arr =new int[1];
        int idx=0,size=0;

        public void add(int ele){
            if(size==arr.length){
                int[] brr =Arrays.copyOf(arr,arr.length+2);
                // arr=new int[brr.length];
                // arr=Arrays.copyOf(brr,brr.length);
                arr=brr;
            }
            arr[idx]=ele;
            idx++;
            size++;
            
        }
        
    }
    public static void main(String[] args) {
        Arraylist arr =new Arraylist();
        arr.add(2);
        arr.add(77);
        System.out.println(arr.size);
        arr.add(34);
        System.out.println(arr.size);

    }

}
