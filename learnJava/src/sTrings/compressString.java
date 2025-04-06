package sTrings;

public class compressString {
    public static void main(String[] args) {
        // String 
        char[] chars= {'s','s','d','e','e','e','e','e','e','e','e','e','e','e','e'};
        String s = "";
        int i=0, j=1;
        int n =chars.length;
        while(j<n){
            int count =1;
            s=s+chars[i];
            while(chars[i]==chars[j]){
                count++;
                j++;
                if(j>=n)break;
            }
            if(count>1)s=s+count;
            else s=s+"@";
            i=j;
            j=i+1;   
        }
        System.out.println(s);
        for(int a=0; a<s.length();a++){
            chars[a]=s.charAt(a);
        }
        System.out.println(s.length());
    }

}
