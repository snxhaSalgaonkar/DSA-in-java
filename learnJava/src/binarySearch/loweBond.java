package binarySearch;

import java.util.Scanner;

public class loweBond {
    public static int min(int a,int b ){
        if(a> b)return b;
        else return a;
         
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter target: ");
        int x=sc.nextInt();//target
        int lo=0, hi=n-1,lb=n;

        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>=x){
                lb=min(lb,mid);
                hi=mid-1;
                
            }
            else lo=mid+1;
        }
        System.out.println(lb);
        sc.close();

    }

}
