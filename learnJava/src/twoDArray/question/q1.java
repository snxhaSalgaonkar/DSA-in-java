package twoDArray.question;

import java.util.Scanner;


public class q1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[][] arr = new int[4][2];
       //input
       for (int i = 0; i <4; i++) {
        for (int j = 0; j <2; j++) {
            arr[i][j]=sc.nextInt();
        }
       }
       
       //output
       for (int i = 0; i <4; i++) {
        for (int j = 0; j <2; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
       sc.close();
        
    }

}
