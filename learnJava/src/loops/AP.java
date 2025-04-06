package loops;
import java.util.Scanner;
public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a no. ");
        int n = sc.nextInt();
        sc.close();

        //upto n terms

        //for(int i=1; 1<=(1+((n-1)*3)); i+=3) 
        //System.out.println(i);

        int a=4;
        for(int i=1; i<=n; i++) 
        {System.out.println(a);
        a+=3;}
        }

    }

