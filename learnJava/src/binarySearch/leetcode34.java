package binarySearch;

public class leetcode34 {
    public static int min(int a,int b ){
        if(a> b)return b;
        else return a;     
    }
    public static void main(String[] args) {
        int [] arr = {3,5,6,16,44,65,70,80,99};
        int x =51;
        int n=arr.length,lo=0,hi=n-1,lb=n;

        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>x){
                lb=min(lb,mid);
                hi=mid-1;
                
            }
            else if(arr[mid]>x)hi=mid-1;
            else if(arr[mid]<x)lo=mid+1;
        }
    }

}
