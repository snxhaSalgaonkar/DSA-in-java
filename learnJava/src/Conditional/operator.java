package Conditional;

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no. ");
        int n = sc.nextInt();

       // if(99<n<100) System.out.println("three diits no: ");

       if(100<=n && n<100) System.out.println("3 digit no.");
       else System.out.println(" not a 3 digit no ");

       if(n%5==0 || n%3==0) System.out.println("divisible by 5 and 3");
       else System.out.println("not divisible by 5 and 3:");

       sc.close();
    }


}
