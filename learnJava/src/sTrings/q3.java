package sTrings;

import java.util.Scanner;

public class q3 {
    //take int input and convert it into stirng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no. ");
        int n =sc.nextInt();
        //String s = ""+ n;
        String s = Integer.toString(n);

        // s = n+s;
        System.out.println(s);
        System.out.println(s.length());
        sc.close();
    }

}
