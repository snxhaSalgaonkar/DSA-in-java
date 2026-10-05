package prefixSum;

public class aabasic {
    public static void printArray(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,1,8,2,4,3,2};
        int[] pre = new int[arr.length];
        pre[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            pre[i]=arr[i]+pre[i-1];

            
        }
        printArray(arr);
        printArray(pre);
    }
    
}
