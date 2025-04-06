package queues;

import java.util.LinkedList;
import java.util.Queue;

public class printFunction {
    public static void print(Queue<Integer> q){
        Queue<Integer> p = new LinkedList<>();
        while(q.size()!=0){
            int x= q.remove();
            p.add(x);
            System.out.print(x+ " ");
        }
        
        while(p.size()!=0){
            q.add(p.remove());
        }
        System.out.println();
    }
    public static void main(String[] args) {
         Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        print(q);
        print(q);
    }

}
