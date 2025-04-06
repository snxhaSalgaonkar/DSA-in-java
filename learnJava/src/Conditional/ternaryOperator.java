package Conditional;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no. : ");
         int n = sc.nextInt();
        sc.close();

        //conditions ? if true: if false

        System.out.println((n%2 == 0)? "even": "odd");

    }

}
