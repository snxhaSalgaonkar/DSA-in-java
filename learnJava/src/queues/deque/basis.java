package queues.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class basis {

    public static void main(String[] args) {
        //Deque<Integer> dq = new LinkedList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        //add, remove/poll, peek/element
        dq.addLast(1);
        dq.addLast(2);
        System.out.println(dq);
        dq.addFirst(3);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.addFirst(5);
        dq.addLast(6);
        System.out.println(dq);
        //dq.peekFirst();

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        dq.remove();//removes the first

        System.out.println(dq);
        dq.add(6);

        dq.add(10);//adds at last
        System.out.println(dq);
        
        dq.removeFirstOccurrence(6);
        System.out.println(dq);
    }
}
