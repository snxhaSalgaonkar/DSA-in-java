package array.question;
//import java.lang.Math;

public class max2 {
    public static void main(String[] args) { 
        int[] arr ={10, 20, 30, 99, 50, 60, 4, 5, 65,};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
           //if(arr[i]>max) max=arr[i];
           max = Math.max(max,arr[i]);
            
        }
        System.out.println(max);
        
    }

}
