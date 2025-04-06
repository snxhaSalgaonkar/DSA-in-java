package bubbleSort;

public class q8 {
    public static void print(int[]arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {54,11,28,47,91,63};
        print(arr);
        System.out.println("3,0,1,2,5,4,");
        int n = arr.length;
        for (int i = 0; i<n; i++) {
            int count=0;
            for (int j = 0; j<n; j++) {
                if(arr[i]>arr[j])count++;   
            }
            arr[i]=count;   
        }
        print(arr);
    }


}
