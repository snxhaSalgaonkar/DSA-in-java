package loops;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no. ");
        int n = sc.nextInt();
        sc.close();
        for(int i=n; i<=(n*10); i+=n){
            if(i%n==0 )
            System.out.print(i+ " ");
        }  
    }

}
