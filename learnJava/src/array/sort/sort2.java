package array.sort;

public class sort2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 1, 0,0,1,1,0,};
        int n = arr.length;
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int i =0;
        int j = n-1;
        while (i<j){
            if(arr[i]==0)i++;
            else if(arr[j]==1) j--;
            //if(i>j)break;//important
            else if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
    
}
