package recurrion1;
import java.util.Scanner;

public class greatestCommonDivisor {
    // public static int hcf(int a, int b){
    //     for(int i=Math.min(a,b);i>=1;i++){
    //         if(a%i==0&&b%i==0)return i;
    //     }
    //     return 1;
    // }

    public static int hcf(int a, int b){
        if(b%a==0) return a;
        return hcf(b%a,a);
    }

    //HCF(a,b)<=min(a,b);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        int a =sc.nextInt();
        System.out.println("enter b:");
        int b =sc.nextInt();
        System.out.println(hcf(a,b));
        sc.close();

    }
}
