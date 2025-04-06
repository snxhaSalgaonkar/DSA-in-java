package array;

import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // sc.close();

        //input
        for (int i = 0; i <=n-1; i++) {
            arr[i]= sc.nextInt();
            
        }
        //output
        for (int i = 0; i <=n-1; i++) {
            System.out.print(arr[i]+ " ");
        }

    }

}
