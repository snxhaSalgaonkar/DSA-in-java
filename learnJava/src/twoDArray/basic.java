package twoDArray;

public class basic {
    public static void main(String[] args) {
       int[][] grid = new int[3][2];
       int[][] arr ={{10,20},{20,30},{33,44}};
       //0  1
       //10 20
       //20 32
       //33 44
       grid[0][0]=10;
       grid[0][1]=20;
       grid[1][0]=20;
       grid[1][1]=32;
       System.out.println(grid[0][1]);
       System.out.println();


       for(int[]ele:arr){
        for(int x:ele){
            System.out.print(x+" ");
        }
        System.out.println();
       }

    }

}
