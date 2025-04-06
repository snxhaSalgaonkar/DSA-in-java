package array;

public class twoPointer {
    public static void main(String[] args) {
        int[] arr ={10, 20, 30, 40, 50, 60, 70, 80, 90,};
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        //reverse

        for (int i = 0; i < n/2; i++) {
            int j = n-1-i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        
    }

}
