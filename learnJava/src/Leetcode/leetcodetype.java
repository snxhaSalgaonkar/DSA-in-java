package Leetcode;
import java.util.*;
public class leetcodetype {
    public boolean isPalindrome(String s) {
        int n=s.length();
        if(n==0) return true;

        int i=0;
        int j=n-1;
        while(i<=j) {
            char left = s.charAt(i);
            char rigth = s.charAt(j);
            if (Character.isLetterOrDigit(left)) {
                left = Character.toLowerCase(left);
            }
            if (Character.isLetterOrDigit(rigth)) {
                rigth = Character.toLowerCase(rigth);
            }
            if (left != rigth) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}