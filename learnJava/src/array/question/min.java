package array.question;

public class min {
    public static void main(String[] args) {
        int[] arr ={10, 20, 30, 99, 50, 60, 4, 5, 65,};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
           //if(arr[i]>max) max=arr[i];
           min = Math.min(min,arr[i]);
            
        }
        System.out.println(min);
    }

}
