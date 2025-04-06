package recurrion1;
import java.util.Scanner;
public class binaryString {

    //generate all binary string give a int n with no consecutive 1;

    public static void binary(int n, String s){
        int m = s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
        if(m==0||s.charAt(m-1)=='0'){
                binary(n,s+1);
                binary(n, s+0);
            }
        else binary(n,s+0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        binary(n,"");
        sc.close();
    }
}
