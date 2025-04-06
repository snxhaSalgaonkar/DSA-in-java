package queues;

import java.util.LinkedList;
import java.util.Queue;

public class Basic1 {
    public static void main(String[] args) {
        // Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();

        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("size "+ q.size());
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println("size "+ q.size());
        System.out.println(q.element());
        System.out.println(q.peek());
    }

}
