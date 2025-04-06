package recurrion1;
import java.util.Scanner;

public class q5 {
    public static int sum(int n){
        if(n==0) return n;//base case
        return n+sum(n-1);
    }

    //print sum from 1 To n parameterised
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("enter a no. ");
        int n=sc.nextInt();
        
        System.out.println(sum(n));
        sc.close();
    }

}
