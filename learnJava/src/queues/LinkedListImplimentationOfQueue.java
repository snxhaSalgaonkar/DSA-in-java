package queues;

//import queues.ArrayImplementationOfQueue.queueArray;

class node{
    int val;
    node next;
    node(int val){//constructor
        this.val =val;
    }
}


public class LinkedListImplimentationOfQueue {
    public static class queueLL{
        node head=null;
        node tail=head;
        int len=0;
        void add(int x){
            node a =new node(x);
            len++;
            if(head==null){
                a.next=head;
                head=a;
                tail=head;
                return;
            }
            tail.next=a;
            tail=tail.next;  
        }
        int remove(){
            if(head==null){
                System.out.println("queue is empty");
                return 0;
            }
            int x= head.val;
            head=head.next;
            len--;
            return x;
        }
        
        int peek(){
            if(head==null){
                System.out.println("queue is empty");
                return 0;
            }
            return head.val;
        }
        void print(){
            node t = head;
            if(t==null){
                System.out.println("empty queue");
                return;
            }
            while(t!=null){
                System.out.print(t.val+" ");
                t=t.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        // queueArray q = new queueArray();
        queueLL q =new queueLL();
        q.print();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.print();

        q.add(5);
        q.add(6); 
        q.print();

        //peek
        System.out.println("peek: "+ q.peek());

        q.remove();
        q.print();

        q.add(7);
        q.print();
        System.out.println("size: "+q.len);
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.print();

        q.remove();
        q.remove();
        System.out.println("size: "+q.len);
        
        
    }

}
