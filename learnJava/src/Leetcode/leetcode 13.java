class Solution {
    public int getnum(char ch){
        if (ch=='I') return 1;
        if (ch=='V') return 5;
        if (ch=='X') return 10;
        if (ch=='L') return 50;
        if (ch=='C') return 100;
        if (ch=='D') return 500;
        if (ch=='M') return 1000;
        return 0;
    }

    public int romanToInt(String s) {
        int n= s.length();
        int num=0;
        int prevx=0;
        for (int i=0;i<n-1;i++){
            char ch=s.charAt(i);
            char nextch = s.charAt(i+1);
            int x = getnum(ch);
            int nextx = getnum(nextch);
            if (x>nextx){
                num=x-prevx;
            }
            else {
                int diff= nextx-x;
                num+=diff;
                i++;
            }
        }
        return num;
         
    }
}