package Conditional;
import java.util.Scanner;
public class gradeOfStudent {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("enter a marks in percentage:");
        int a = sc.nextInt();
        sc.close();
        
        if(81<=a) System.out.println("Grade: very good");
        else if(61<=a) System.out.println("Grade:  good"); 
        else if(41<=a) System.out.println("Grade: average");
        else System.out.println("Grade: fail");
    }

}
