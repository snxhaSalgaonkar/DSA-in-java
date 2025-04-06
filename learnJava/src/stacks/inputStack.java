package stacks;

import java.util.Scanner;
import java.util.Stack;

public class inputStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("enter the no of  elements");
        n= sc.nextInt();
        System.out.println("enter the  elements");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
            
        }

        System.out.println(st);


    }

}
