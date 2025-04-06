package bubbleSort;
import java.util.Arrays;
public class builtInSort {
    public static void main(String[] args) {
        int[] arr ={15,3,5,76};
        for ( int ele:arr) {
            System.out.print(ele+" ");    
        }
        System.out.println();
        Arrays.sort(arr);
        for ( int ele:arr) {
            System.out.print(ele+" ");   
        }
        System.out.println();
    }
}
