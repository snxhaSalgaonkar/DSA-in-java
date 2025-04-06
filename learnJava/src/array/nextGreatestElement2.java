package array;
//package "";

public class nextGreatestElement2 {
    public static void main(String[] args) {
        int[] arr = {2,44,7,99, 39, 32, 54 ,7,};
        int n = arr.length;
        int[] ans=new int[n];
        ans[n-1]=-1;
        int nge=arr[n-1];

        //ans[n-2]=arr[n-1];
        // for (int i = n-2; i >=1; i--) {
        //     if(arr[i]>=nge){
        //         nge=arr[i];
        //         ans[i-1]=nge;
        //     }
        //     else{//arr[i]<nge;
        //         ans[i-1]=nge;           
        //     }    
        // }

        for (int i = n-2; i >=0; i--) {
            ans[i]=nge;
            nge=Math.max(nge,arr[i]);    
        }



        for(int ele: arr)
        {System.out.print(ele+ " ");}
        System.out.println();
        for(int ele: ans)
        {System.out.print(ele+ " ");}

    }

}
