package prefixSum;

public class leetcode724 {
    public int pivotIndex(int[] nums) {
        int n= nums.length;
        int i=0, j=n-1;
        int si=nums[i], sj=nums[j];
        while(i<j){
            if(si==sj && j-i==2){
                return i+1;
            }
            if(si<sj){
                i++;
                si+=nums[i];   
            }
            else if(si>sj){
                j++;
                sj+=nums[i];
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        
    }
    
}
