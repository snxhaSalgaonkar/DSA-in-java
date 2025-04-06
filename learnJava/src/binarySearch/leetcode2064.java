package binarySearch;

public class leetcode2064 {
    public static void main(String[] args) {
        int[] arr= { 11,6};
        int n=6;
        int m=arr.length;
        int[]nums= new int[n+2];
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            mx=Math.max(arr[i],mx);
        }
        int ans=0;
        int lo=1,hi=mx;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            //nums[0]=mid;
            int i=0,j=0;
            int x=arr[0];
            ans=mid;
            
            while(j<m){
                if(x>mid){
                    nums[i]=mid;
                    x-=nums[i];    
                }
                else if(x<=mid){
                    nums[i]=x;
                    j++;
                    if(j<m)x=arr[j];
                    else break;
                }
                if(i>n)break;
                i++;
            }
            if(i<=n){
                
                ans=mid;
                //System.out.println(ans ); 
                System.out.println("ans " + ans);
                System.out.println("lo "+ lo);
                System.out.println("hi "+ hi);
                System.out.println();
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(" * " +ans);   
    }
    

    
}
