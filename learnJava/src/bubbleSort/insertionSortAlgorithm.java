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
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
       // int[] arr ={51,19,13,7,6,4,1};
        int[] arr = {1,2,31,4,5,};
        print(arr);
        insertionSort(arr);
        print(arr);
    }


    }


