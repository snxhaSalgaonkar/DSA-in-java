package twoDArray;

public class multipicationOfTwoMatrices {
    public static void print(int[][]arr){
        int m =arr.length, n=arr[0].length;
        for (int i = 0; i <m; i++) {//row
            for(int j=0; j<n; j++){//column
               System.out.print(arr[i][j]+ " ");
 
            }
            System.out.println();   
         }
         System.out.println();

    }
    public static void main(String[] args) {
        int[][] a ={{2,3}};
        int[][] b={{1,0},{0,2}};
        if(a[0].length!=b.length){
           System.out.println("multiplication not possible"); 
        }
        else
        {int[][] c = new int[a.length][b[0].length];
        //c=1x2
        for (int i = 0; i<c.length; i++) {
            for (int j = 0; j<c[0].length; j++) {
                for(int k=0; k<b.length; k++){
                    c[i][j]+=a[i][k]*b[k][j];    
                }
                //c[i][j]= (a[i][0]*b[0][j])+ (a[i][1]*b[1][j])+ (a[i][2]*b[2][j]);
            }
        }
        print(a);
        print(b);
        print(c);
       
       
        }
    }

}
