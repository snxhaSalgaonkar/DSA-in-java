package array;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr ={10, 20, 30, 40, 50, 60, 70, 80, 90, };
        int n = arr.length;
        //print arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();


        int k = 1;
        //k=k%n;
        int[] temp=new int[k]; //extra array temp
    
        for (int i = 0; i < n; i++) {
            if (i<k) {
                 temp[i] = arr[i];        
            } 
            else {
                arr[i-k]= arr[i];   
             }
        }
        for (int i = 0; i < k; i++) {
            int j=n-k+i;
            arr[j]=temp[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }

    }

}
