package array.sort;

public class merge {
    public static void main(String[] args) {
        int[]arr={0,8,55,74,99,100};
        int[]brr={4, 33, 66,72};
        int a=arr.length, b=brr.length, c=a+b;
        int[]crr=new int[c];
        int i=0, j=0, k=0;
        while(k<c){
            if(arr[i]>=brr[j]){//brr[j]small            
                crr[k]=brr[j];
                k++; j++;
            }
            else if(arr[i]<brr[j]){//arr[i]small
                crr[k]=arr[i];
                k++; i++;
            }
            if(i>=a){// arr got over now take elements from brr
                while(j<b){
                    crr[k]=brr[j];
                    j++;k++;
                }
                
            }
            else if(j>=b){
                while(i<a){
                    crr[k]=arr[i];
                    k++;i++;
                }
            }

            
        }
        System.out.print("crr: ");
        for(int ele:crr){
            System.out.print(ele+ " ");
        }

        
    }

}
