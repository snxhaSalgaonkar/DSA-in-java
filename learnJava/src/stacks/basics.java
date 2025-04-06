package stacks;

import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());//to check empty or not
        st.push(1);
        st.push(24);
        st.push(98);
        st.push(5);

        System.out.println(st.peek());
        System.out.println(st);

        //pop
        st.pop();// remove the top most element
        System.out.println(st);
        System.out.println("size: "+ st.size());




    }

}
