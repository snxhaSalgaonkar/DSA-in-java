package loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a no. ");
        int n = sc.nextInt();
        sc.close();


        int a =3, r=4;
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            a*=r;
        }
            
        }
    }
