package stacks;

import java.util.Stack;

public class displayStackUsingRecirsion {
    public static void display(Stack<Integer> st){
        if(st.size()==0)return;
        int x= st.pop();
        display(st);//1 2 3 4 5 
        System.out.print(x+" ");
        // display(st); //5 4 3 2 1 
        st.push(x);
        st.push(x);
    }
    public static void main(String[] args) {
         Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        display(st);
        

    }

}
