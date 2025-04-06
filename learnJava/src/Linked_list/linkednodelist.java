package Linked_list;
class Node{
    int val;
    Node next;
    Node(int val){//constructor
        this.val=val;
    }
}

public class linkednodelist {
    public static void displayR(Node head){//using recursion
           if(head==null) return;
           System.out.print(head.val+" ");
           displayR(head.next);
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp =temp.next;
        }
        System.out.println("\n");
    }
    public static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;    
        }
        return count;
    }
    public static void main(String[] args) {
        Node a =new Node(10);//head node 
        Node b =new Node(20);
        Node c =new Node(400);
        Node d =new Node(30);
        Node e =new Node(40);
        Node f =new Node(50);//tail


        // Node temp =new Node(50); //deep copy
        // temp=a;
        // //Node temp =a;//shallow copy 

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        // System.out.println(a.val);
        // System.out.println(a.next.val);
        // System.out.println(a.next.next.val);
        // System.out.println(a.next.next.next.val);
        
        displayR(a);
        System.out.println();
        display(a);
        
        System.out.println(length(a));
        System.out.println(a.val);

           
    }
}
