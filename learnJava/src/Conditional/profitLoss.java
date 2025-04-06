package Conditional;
import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter cost prize: ");
        double cp = sc.nextDouble();
        System.out.print("enter selling prize: ");
        double sp = sc.nextDouble();
        double n = sp - cp ;

        if(n<0) System.out.print("loss of ");
        if(n==0) System.out.print(" no loss no profit");
        if(n>0) System.out.print("profit of:");

        if(n<0)   System.out.println(-n);
        if(n>0) System.out.println(n);
        
        sc.close();
        
        }

}
