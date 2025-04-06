package Conditional;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of side a : ");
        int a = sc.nextInt();
        System.out.print("enter the length of side b : ");
        int b = sc.nextInt();
        System.out.print("enter the length of side c : ");
        int c = sc.nextInt();
        sc.close();

        if((a+b)>c && (b+c)>a && (c+a)>b) System.out.println("it is a triangle");
        else System.out.println("invalid triangle");

        
    }

}
