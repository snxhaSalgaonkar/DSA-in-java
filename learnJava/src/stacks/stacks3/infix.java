package stacks.stacks3;

import java.util.Stack;

public class infix {
    public static void work(Stack<Integer> val, Stack<Character> op ){
        int v2= val.pop();
        int v1= val.pop();
        if(op.peek()=='-')val.push(v1-v2);
        else if(op.peek()=='+')val.push(v1+v2);
        else if(op.peek()=='*')val.push(v1*v2);
        else if(op.peek()=='/')val.push(v1/v2);
        op.pop();

    }
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        System.out.println(str);
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0;i<str.length(); i++){
           
            char ch = str.charAt(i);//conversation from string to character
            int ascii = (int)ch;

            //0-48 and 9-57
        
        if(ascii>=48 && ascii<=57) val.push(ascii-48);//convert 48 to 0;
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
            else if(ch=='('){
                op.push(ch);
            }

        }
       
        }
        while(val.size()>1)  work(val,op);
        System.out.println(val.peek());

    }


}
