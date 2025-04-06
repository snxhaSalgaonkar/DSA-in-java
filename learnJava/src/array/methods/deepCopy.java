package array.methods;

import java.util.Arrays;

public class deepCopy {
    public static void main(String[] args) {
        int[] arr ={10, 20, 30, 99, 98, 60, 4, 5, 65,};

        //using for each loop
        System.out.print("arr:");
        for(int ele : arr){//for int ele in array
            System.out.print(ele+" ");
        }
        System.out.println();

        //deep copy 
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0]= 70;
        System.out.print("arr[0]:");
        System.out.println(arr[0]);
       
        System.out.print("brr:");
        for(int ele : brr){
            System.out.print(ele+" ");
        }
        System.out.println();

        //or
        int[] crr = new int[arr.length];
        for (int i = 0; i < crr.length; i++) {
            crr[i] = arr[i];

        }
        crr[0] = 100;
        
        System.out.println("arr[0]: "+ arr[0]);
        





    }

}
