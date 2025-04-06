package bubbleSort;

public class insertionSortAlgorithm {
    public static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
 
    } 
    public static void print(int[]arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       // int[] arr ={51,19,13,7,6,4,1};
        int[] arr = {1,2,31,4,5,};
        print(arr);
        int n =arr.length; //min=Integer.MAX_VALUE;
        for (int i = 1; i <n; i++) {
            int j=i;
            while(j>=1 && arr[j]<arr[j-1]){
            swap(arr,j-1,j);     
                j--;  
            }
            
        }
        print(arr);
    }

}
