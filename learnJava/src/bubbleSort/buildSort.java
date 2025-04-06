package bubbleSort;

public class buildSort {
    public static void print(int[]arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    //public static void swap(arr,i,j){
    
    
    public static void main(String[] args) {
        int[] arr ={15,13,10,6,3,-4};
        int n = arr.length;
        print(arr);


        //bubble sort
        for(int x=0;x<n-1;x++){
            for (int i = 0; i <n-1-x; i++) {
                if(arr[i]>arr[i+1]){
                int temp =arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
        
        print(arr);
        
    }

}
