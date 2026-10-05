//238. Product of Array Except Self

class Solution {
    public int[] productExceptSelf(int[] a) {
        int n= a.length;
        int[] ans =new int[n];
        ans[0]=1;
        int SuffixProduct=1;
        for (int i=1;i<n;i++){
            ans[i]=ans[i-1]*a[i-1];
        }
        for (int i=n-1;i>=0;i--){
            ans[i]=ans[i]*SuffixProduct;
            SuffixProduct*=a[i];  
        }
        return ans;
    }
}