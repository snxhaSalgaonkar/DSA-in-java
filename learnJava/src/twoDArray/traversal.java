package twoDArray;

import java.util.Scanner;

public class traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];

        //input of 2D array
        for (int r = 0; r < 2; r++) {//row
            for(int c=0; c<3; c++){//column
               arr[r][c]=sc.nextInt();
            }
            // System.out.println();   
         }

        //output
        System.out.println("arr: ");
        for (int r = 0; r < 2; r++) {//row
           for(int c=0; c<3; c++){//column
              System.out.print(arr[r][c]+ " ");

           }
           System.out.println();   
        }
        //arr.length
        int m = arr.length;//no of row/lines
        int n = arr[0].length;//no of coulum
        System.out.println(m);
        System.out.println(n);
       
    }

}
