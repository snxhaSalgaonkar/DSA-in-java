package array.methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bluitinMethods {
    public static void main(String[] args) {
        int[] arr ={10, 20, 30, 99, 98, 60, 4, 5, 65,};

        //using for each loop
        for(int ele : arr){//for int ele in array
            System.out.print(ele+" ");
        }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+ " ");
        // }

        //to get array printed in a accending order
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.err.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }

        
        
        
    }

}
