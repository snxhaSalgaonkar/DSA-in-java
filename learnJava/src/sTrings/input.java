package sTrings;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter:");
        //String s = "sneha";
        String str = sc.next();
        // String s = "sneha";
        // System.out.println(s);
        System.out.println(str);
        str=str+str.indexOf(0);
        System.out.println(str);
        sc.close();

    }

}
