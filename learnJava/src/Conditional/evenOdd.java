package Conditional;
import java.util.Scanner;
public class evenOdd
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no. : ");
        int n = sc.nextInt();
        sc.close();

        if(n%2 == 0) System.out.println("even");
        //if(n%2 == 1) System.out.println("odd");
        else System.out.println("odd");

        if(n%5 == 0) System.out.println("yes it is divible by 5");
        else System.out.println("no it is not divisible by 5");

        if(n>0){
             System.out.println("positive no. ");
        }
        else {
            System.out.println("negative no. ");
        }
    }

}
