package recurrion1;
import java.util.Scanner;

public class q7 {
    public static int fun(int a,int b){
        if(b==0)return 1;
        if(b==1)return a;
        int c =fun(a,b/2)*fun(a,b/2);
         return c;
    }
    //calulate a raised to b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a . ");
        int a=sc.nextInt();

        // Scanner bc = new Scanner(System.in);
        System.out.println();
        System.out.print("enter b. ");
        int b=sc.nextInt();

        //output 
        if(b%2==0)System.out.println(fun(a,b));
        else System.out.println(a*fun(a,b));
        sc.close();
    }

}
