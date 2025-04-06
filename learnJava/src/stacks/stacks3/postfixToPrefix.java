package stacks.stacks3;

import java.util.Stack;

public class postfixToPrefix {
    public static void work(char ch,Stack<String> val){
        String v2= val.pop();
        String v1= val.pop();
        String t= ch+v1+v2; //cchange
        val.push(t);
    }
    public static void main(String[] args) {
        String str ="953+4*6/-"; //postfix
        System.out.println("postfix: "+ str);
        Stack<String> val = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch =str.charAt(i);
            String s = ""+ ch;
            int ascii = (int)ch;//0-48 and 9-57
            if(ascii>=48 && ascii<=57) {
                val.push(s);
                
            }else{
                work(ch,val);

            }
        }
        System.out.println("prefix"+val.pop());
    }
   
}
