package twoDArray.question;

public class q9 {
    public static void main(String[] args) {
        int[][]arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},};
        int m =arr.length, n=arr[0].length;
        //m==6, n==5
        int minr=0, maxr=m-1, minc=0, maxc=n-1;
        while(maxr>=minr && maxc>=minc)
        {    
        //blue
        for(int j=minc;j<=maxc;j++){
            System.out.print(arr[minr][j]+" ");
        }

        minr++;
        if(minr>maxr|| minc>maxc)break;
        //orange
        for(int i=minr;i<=maxr;i++){
            System.out.print(arr[i][maxc]+" ");
        }
        maxc--;
        //red
        for(int j=maxc;j>=minc;j--){
            System.out.print(arr[maxr][j]+" ");
        }
        maxr--;
        //green
        for(int i=maxr;i>=minr;i--){
            System.out.print(arr[i][minc]+" ");
        }
        minc++;
        }

    }

}
