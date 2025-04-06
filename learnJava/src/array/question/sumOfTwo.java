package array.question;

public class sumOfTwo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 55, 64,32, 5, 3,7, 4,};
        int x = 7;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
          for (int j = i+1; j < n; j++) {
            if(arr[i] +arr[j]==x) 
            System.out.println(arr[i]+ " "+arr[j]);
          }  
        }
    }

}
