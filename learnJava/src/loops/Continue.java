package loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a no. ");
        int n = sc.nextInt();
        sc.close();

        // for (int i = 1; i <= n; i+=2) {
        //    System.out.print(i+" ");  
        // }

        for (int i = 1; i <= n; i+=1) {
            if(i%2==0){
                continue;
            }
          System.out.print(i+" ");
        }
    }
}