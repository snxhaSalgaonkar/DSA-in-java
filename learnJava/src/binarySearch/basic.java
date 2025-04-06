package binarySearch;

public class basic {
    public static void main(String[] args) {
        int [] arr = {3,5,6,8,99};
        int target =51;
        int n=arr.length,lo=0,hi=n-1;
        boolean flag = false;
        
        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(arr[mid]<target)lo=mid+1;
            else if (arr[mid]>target)hi=mid-1;
            else if (arr[mid]==target) {
                flag=true;
                break;
            }
        }
        if (flag==true)System.out.println("target present\n");
        else System.out.println("target not find\n");   
    }
}
