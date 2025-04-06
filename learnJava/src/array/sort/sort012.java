package array.sort;

public class sort012 {
    //dutch flag algorithm
    //3pointer
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 0, 1, 2, 2, 0, 1, 1, 1, 2, };
        int n = arr .length;
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int mid=0, hi=n-1, low=0;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp= arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++; mid++;
            }
            else if (arr[mid]==1) mid++;
            else{//arr[mid]==2
                int temp= arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
        for(int ele: arr){
            System.out.print(ele + " ");
        }

    }

}
