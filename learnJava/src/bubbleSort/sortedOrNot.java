package bubbleSort;

public class sortedOrNot {
    public static void main(String[] args) {
        int[] arr ={1,3,5,76};
        boolean flag = true;//true means sortedd

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>=arr[i+1]){
                flag = false;
                //System.out.println("array is not sorted");
                break;
            }    
        }
        if(flag==true)System.out.println("sorted");
        else  System.out.println("unsorted");
    }

}
