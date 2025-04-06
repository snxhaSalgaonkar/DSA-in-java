package twoDArray.question;

public class q5transpose {
    public static void main(String[] args) {
        int[][]a={{1,2,3,},{4,5,6}};
        int m =a.length, n=a[0].length;
        //transpose is column wise printing
        // for (int j=0; j<n; j++) {
        //     for (int i=0; i<m; i++) {
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        //transpose2
        int[][] transpose = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                transpose[i][j]=a[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        

    }
    

}
