package stacks;
import java.util.*;

public class balanceedBrackets {
    public static boolean isbalnced(String str){
        Stack<Character> st = new Stack<>();
        int n =str.length();
        //if(n%2!=0)return false;
        for (int i = 0; i <n; i++) {
            char ch =str.charAt(i);
            if(ch=='(') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                else st.pop();
            }
            
        }
        if(st.size()>0) {
            System.out.print("no of brackets required to balance: ");
            System.out.println(st.size());
            
            return false;}
        return true;


    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str =sc.nextLine();
    System.out.println(str);
    System.out.println(isbalnced(str));
    }
    


}
