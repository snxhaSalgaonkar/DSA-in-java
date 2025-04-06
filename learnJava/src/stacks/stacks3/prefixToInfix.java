package stacks.stacks3;

import java.util.Stack;

public class prefixToInfix {
    public static void work(char ch, Stack<String> val){
        String v1= val.pop();
        String v2= val.pop();
        String t= v1+ch+v2;
        t='('+t+')';
        val.push(t);


    }
    public static void main(String[] args) {
         String str ="-9/*+5346"; //prefix
         System.out.println("prefix: "+str);
        Stack<String> val = new Stack<>();
        for(int i=str.length()-1; i>=0; i--){
            char ch =str.charAt(i);
            int ascii = (int)ch;//0-48 and 9-57
            if(ascii>=48 && ascii<=57) {
                val.push(""+ch);
                
            }else{
                work(ch,val);
            }
        }
        System.out.println("infix "+val.pop());
    }

}
