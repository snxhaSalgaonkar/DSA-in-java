package loops;
import java.util.Scanner;
public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a no. ");
        int n = sc.nextInt();
        sc.close();

        int x = 0; //0 means prime
        for (int i = 2; i<=(n-1); i++) {
          if(n%i==0)//i is a factor of n
            {System.out.println("composite number");
            x=1; //1 means composite
            break;
          }
          //else System.out.println("prime number");
            
        }
        if(n==1) System.out.println("neither prime nor composite");
        else if(x==0) System.out.println("prime number");
    }
}
