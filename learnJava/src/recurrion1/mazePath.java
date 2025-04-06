package recurrion1;
import java.util.Scanner;

public class mazePath {
//     public static int maze(int row,int col, int n,int m){
//         if(row==n||col==m) return 1;
//         int rightways = maze(row,col+1,m,n);
//         int downways = maze(row+1,col,m,n);
//         return rightways + downways;   
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter n. ");
//         int n=sc.nextInt();
//         System.out.print("enter m. ");
//         int m=sc.nextInt();
//         System.out.println(maze(1,1,m,n));
//         sc.close();     
// } 

    public static int maze2( int n,int m){
        if(n==1||m==1) return 1;
        int rightways = maze2(m,n-1);
        int downways = maze2(m-1,n);
        return rightways + downways;   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n. ");
        int n=sc.nextInt();
        System.out.print("enter m. ");
        int m=sc.nextInt();
        System.out.println(maze2(m,n));
        sc.close();     
} 

}
