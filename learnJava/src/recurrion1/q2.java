package recurrion1;
import java.util.Scanner;

public class q2 {
    //print 1 to n
    public static void print(int n){
        if(n==0) return ;//base case
        print(n-1);//call
        System.out.println(n);//work
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("enter a no. ");
        int n=sc.nextInt();
        print(n);
        sc.close();
    }

}
