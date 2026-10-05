package Leetcode;

import java.util.HashSet;


public class leetcode217 {
      public static boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashSet <Integer> set = new HashSet<>();
        for(int i=0; i<n;i++){
            set.add(nums[i]);

        }
        if(set.size()==n)return true;
        return false;


        
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,1};
        Boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }
    
}
