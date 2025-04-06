package recurrion1;

import java.util.Scanner;

public class fibo {
    public static int fibo(int n){
        if(n<=1)return n;
        return fibo(n-1)+ fibo(n-2);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  . ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(fibo(i));
        }
       // System.out.println(fibo(n));
        sc.close();
        
    }

}
