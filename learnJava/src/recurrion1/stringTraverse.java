package recurrion1;

public class stringTraverse {
    public static void print(String s,int i){
        if(i==s.length())return ;
        System.out.print(s.charAt(i));
        print(s,i+1);

    }
    public static void main(String[] args) {
        String s = " Sneha Salgaonkar";
        print(s,0);
        
    }

}
