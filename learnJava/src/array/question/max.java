package array.question;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter array size: ");
        int n = sc.nextInt();
        //array input
        int[] arr = new int[n];
        System.out.println("enter array element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();    
        }
        // to get max value
        int max=arr[0];
        for(int i=0; i<n;i++){
            if(arr[i]>max)max=arr[i];
        }

            

        System.out.println(max + " is the max value of array");
    }

}
