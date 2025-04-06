package bubbleSort;

//import array.initializeArr;

public class selectionSortAlgorithm {
    public static void print(int[]arr){
    
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j) {
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;

 }  
    public static void main(String[] args) {
        int arr[]={45,7,-5,-2,0,66};
        int n =arr.length;
        print(arr);

        for(int x=0;x<n-1;x++){
            int min=Integer.MAX_VALUE,mindx=-1;
            for (int i = x; i <n; i++) {
                if(arr[i]<min){
                min=arr[i];
                mindx=i;
                }    
            }
           swap(arr,x,mindx);
        }
        print(arr);
    }

}
