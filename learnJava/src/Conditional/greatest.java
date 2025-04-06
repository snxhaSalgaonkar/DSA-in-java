package Conditional;
import java.util.Scanner;
public class greatest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no a:");
        int a = sc.nextInt();
        System.out.print("enter a no b:");
        int b = sc.nextInt();
        System.out.print("enter a no c:");
        int c = sc.nextInt();

       // if(a>b && a>c) System.out.println("greatest no:" +a);
        //if(b>a && b>c) System.out.println("greatest no:" +b);
        // if(c>a && c>b) System.out.println("greatest no:" +c); 
        //can't be used when two or more nos are same

        if(a>=b && a>=c) System.out.println("greatest no:" +a);
        else if(b>=a && b>=c) System.out.println("greatest no:" +b);
        else System.out.println("greatest no:" +c);
        
        sc.close();

        //without using && USING NESTED IF ELSE
        
        if(a>b)
        {
            if(a>c) System.out.println(a+ "is largest");
            else System.out.println(c+ "largest");//c>a>b
        }
        else//b>a 
        {
            if(b>c) System.out.println(b+"largest");
            else //c>b
            System.out.println(c+ "largest");
        }
        

        




    }
}


