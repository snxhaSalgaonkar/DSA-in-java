package Conditional;

import java.util.Scanner;

public class graphHW {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    System.out.print("enter x coordinate:");
    int x = sc.nextInt();
    System.out.print("enter y coordinate:");
    int y = sc.nextInt();
    sc.close();

    if(x>0 && y>0) System.out.println("point lies in first quadrant");
    if(x>0 && 0>y) System.out.println("point lies in fourth quadrant");
    if(0>x && y>0) System.out.println("point lies in second quadrant");
    if(0>x && 0>y) System.out.println("point lies in third quadrant");
    if(x==0 && y==0) System.out.println("point lies on origin");
    if(x!=0 && y==0) System.out.println("point lies on x axis");
    if(x==0 && y!=0) System.out.println("point lies on y axis");

    }

}
