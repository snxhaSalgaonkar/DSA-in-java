package stacks.stacks3;

import java.util.Stack;

public class evalutionOfPrefix {
     public static void work(char ch, Stack<Integer> val){
        int v1 =val.pop();
        int v2 =val.pop();
        if(ch=='-')val.push(v1-v2);
        else if(ch=='+')val.push(v1+v2);
        else if(ch=='*')val.push(v1*v2);
        else if(ch=='/')val.push(v1/v2);
    }
    public static void main(String[] args) {
        String str ="-9/*+5346"; //prefix
        Stack<Integer> val = new Stack<>();
        for(int i=str.length()-1; i>=0; i--){
            char ch =str.charAt(i);
            int ascii = (int)ch;//0-48 and 9-57
            if(ascii>=48 && ascii<=57) {
                val.push(ascii-48);
                
            }else{
                work(ch,val);

            }
        }
        System.out.println(val.pop());

    }

}
