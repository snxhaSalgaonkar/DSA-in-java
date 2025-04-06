package recurrion1;

public class skipCharater {
    //skip a charater in a string;
    public static void print(String s,int i,String ans){
        if(i==s.length()){
            System.out.print(ans);
            return;
        }
        if(s.charAt(i)!='a')ans+=s.charAt(i);
        print(s,i+1,ans);
    }
    public static void main(String[] args) {
        String s ="Sneha Salgaonkar";
        print(s,0,"");
    }

}
