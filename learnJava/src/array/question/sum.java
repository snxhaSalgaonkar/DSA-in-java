package array.question;

public class sum {
    public static void main(String[] args) {
        int[] arr = {81, 45, 31, 82,93, 32, 74,};
        //int n = arr.length;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
            System.out.println(sum);
        }    
    }

}
