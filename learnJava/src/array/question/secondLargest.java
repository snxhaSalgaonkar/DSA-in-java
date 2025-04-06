package array.question;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr ={10, 20, 30, 99, 98, 60, 4, 5, 65,};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
           //if(arr[i]>max) max=arr[i];
           max = Math.max(max,arr[i]);
            
        }
        int smx=Integer.MIN_VALUE;; // use when there are negative nos in array
        for (int i = 0; i < n; i++) {
            if(arr[i]!= max)
            smx = Math.max(smx,arr[i]);    
        }
        System.out.println(max); 
        System.out.println(smx);
        
    }

}
