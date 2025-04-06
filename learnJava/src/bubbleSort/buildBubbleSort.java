package bubbleSort;

public class buildBubbleSort {
    public static void print(int[]arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
   
    public static void main(String[] args) {
        int[] arr ={15,3,10,6,3,-4};
        int n = arr.length;
        print(arr);
        
        //bubble sort optimised
        //increasing order
        for(int x=0;x<n-1;x++){
            boolean flag = true;
            for (int i = 0; i <n-1-x; i++) {
                if(arr[i]>arr[i+1]){
                int temp =arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                flag = false;
                }
             }
            if(flag==true)break;//to check wheather it is already a sorted array
        }
        print(arr);

        //decreasing order
        for(int x=0;x<n-1;x++){
            boolean flag = true;
            for (int i = 0; i <n-1-x; i++) {
                    if(arr[i]<arr[i+1]){//change
                    int temp =arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag = false;
                }
            }
            
            if(flag==true)break;
            }
        print(arr);
    
        
    }

}
