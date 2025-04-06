package array;

public class nextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {2,44, 85, 3, 7, 69, 32,};
        int n = arr.length;
        int[] ans=new int[n];
        ans[n-1]=-1;

        //method 1: brute force 
        for (int i = 0; i < n-1; i++) {
            int max= Integer.MIN_VALUE;
            for (int j = i+1; j < n; j++) {
                max= Math.max(max,arr[j]);    
            }
            ans[i]=max;    
        }
        for(int ele:arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        for(int ele:ans){
            System.out.print(ele+ " ");
        }
        //time consuming

    }

}
