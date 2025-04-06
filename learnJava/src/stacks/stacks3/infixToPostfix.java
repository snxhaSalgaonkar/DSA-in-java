package stacks.stacks3;

import java.util.Stack;

public class infixToPostfix {
    public static void work(Stack<String> val,Stack<Character> op){
        String v2=val.pop();
        String v1=val.pop();
        char o=op.pop();
        String t= v1 + v2 + o;  //change
        val.push(t);
    }
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        System.out.println(str);
        Stack<Character> op = new Stack<>();
        Stack<String> val = new Stack<>();
        for(int i=0;i<str.length(); i++){
           
                char ch = str.charAt(i);//conversation from string to character
                int ascii = (int)ch;

    
                //0-48 and 9-57
            
            if(ascii>=48 && ascii<=57) {
                String s=""+ ch;
                val.push(s);
            }
            else if(op.size()==0 || ch=='('|| op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    //work
                    work(val,op);
                }
                op.pop();
            }
            else{
                if(ch=='-'||ch=='+'){
                    //work
                    work(val,op);
                    //push
                    op.push(ch);
                }
                else if(ch=='*'||ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                    //work
                    work(val,op);
                    //push
                    op.push(ch);
    
                    }
                    else op.push(ch);
    
                }
                
    
            }
           
        }
            while(val.size()>1)  work(val,op);
            String prefix =val.pop();
            System.out.println(prefix);
    
    
    }

}
