package queues.queue2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//reverse first k elements of a Queue

public class reverseTheQueue {
    public static void reverse(Queue<Integer> q,int k){
        Stack<Integer> st =new Stack<>();
        int i=0;
        while(i!=k){
            st.push(q.remove());
            i++;
        }
        while(st.size()!=0){
            q.add(st.pop());
        }
        i=0;
        while(i!=k-1){
            int x= q.poll();
            q.add(x);
            i++;

        }

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int k=3;
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        reverse(q,k);
        System.out.println(q);

        
    }
    
}
