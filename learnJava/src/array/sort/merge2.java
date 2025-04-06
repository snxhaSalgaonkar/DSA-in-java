package array.sort;

public class merge2 {
    public static void main(String[] args) {
        int[]arr={0,44,55,74,99};
        int[]brr={4, 8, 66,72};
        int a=arr.length, b=brr.length, c=a+b;
        int[]crr=new int[c];
        int i=a-1, j=b-1, k=c-1;
        while(k>=0){
            if(arr[i]>=brr[j]){
                crr[k]=arr[i];
                 i--;k--;
            }
            else if(arr[i]<brr[j]){
                crr[k]=brr[j];
                j--;k--;
            }
            if(i<0){// arr got over now take elements from brr
                while(j>=0){
                    crr[k]=brr[j];
                    j--;k--;
                }    
            }
            else if(j<0){
                while(i>=0){
                    crr[k]=arr[i];
                    i--;k--;
                }
            }    
        }
        System.out.print("crr: ");
        for(int ele:crr){
            System.out.print(ele+ " ");
        }

        
    }

}
