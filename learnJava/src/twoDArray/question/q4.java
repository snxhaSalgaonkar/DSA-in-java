package twoDArray.question;

public class q4 {
    public static void main(String[] args) {
        int[][]a={{1,2,3,},{4,5,6}};
        int[][]b={{4,5,6},{1,2,3,}};
        //eithout extra array
        for (int i = 0; i <2; i++) {
            for (int j = 0; j <3; j++) {
                a[i][j]=a[i][j]+b[i][j];    
            }
            System.out.println();
        }
        for (int i=0; i<2; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
           }
    }

}
