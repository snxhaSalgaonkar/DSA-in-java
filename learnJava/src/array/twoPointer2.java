package array;

public class twoPointer2 {
    public static void main(String[] args) {
        int[] arr ={10, 20, 30, 40, 50, 60, 4, 5, 65,};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        //reverse
        int i = 2, j=5; // to swap a particular
        while(i<=j){
            swap(arr,i,j);
            // int temp = arr[i];
            // arr[i] = arr[j];
            // arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr) {
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
           
    }

}
