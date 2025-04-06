package recurrion1;

public class permutation {
    public static void per(String ans,String s){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
    for(int i=0;i<s.length();i++){
        char ch= s.charAt(i);
        String left =s.substring(0,i);//0 to i-1
        String right = s.substring(i+1);
        per(ans+ch,left+right);
    }
}
    public static void main(String[] args) {
        String s= "abc";
        String ans ="";
        per(ans,s);
    }
}
