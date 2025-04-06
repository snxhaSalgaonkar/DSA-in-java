package loops;
import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a no. ");
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++ ){ 
            //(intialization; condition; increment/declaration)
            System.out.println("hellow world");
        }
       //to print 1 to m
        int m = sc.nextInt();
        for(int i=1; i<=m; i++){
            System.out.println(i+"");
        }

        
    }

}
