package recurrion1;
import java.util.Scanner;

public class kiwi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        // for (int i = 1; i<=n; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(1);   
        //     }
        //     System.out.print(" ");
            
        // }
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(1);
                j++;
            }
            System.out.print(" ");
            i++;
        }
        sc.close();
    }

}
