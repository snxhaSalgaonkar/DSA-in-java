package Linked_list;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}


class SLL{//user definfed data sturcture
    Node head;
    Node tail;
    int size=0;
    
    void insertAtTail(int val){
        Node temp=new Node(val);
        if(head==null)head=tail=temp;    
        else {
            tail.next = temp;
            tail=temp;   
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null)head=tail=temp;    
        else {
           temp.next=head;
           head=temp;
        }
        size++;
    }
     void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp =temp.next;
        }
        System.out.println("\n");
    }
    void insert(int index, int val){//0 based indexing
        if(index==0){
            insertAtHead(val);
            return;
        }
        else if(index==size){
            insertAtTail(val);
            return;
        }
        else if(index>size){
            System.out.println("index greater than size");
            return;
        }
        Node temp =new Node(val);
        Node x=head;
        for (int i = 0; i <index; i++) {
            x=x.next;    
        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }
    int get(int index) throws Error{
        if(index==size-1)return tail.val;
        else if(index>=size|| index<0){
            // System.out.println("invaid index");
            // return -1;
            throw new Error("invalid Index== my first self made error");
        }
        Node temp=head;
        for (int i=0; i<index; i++) {
            temp=temp.next;    
        }
        return temp.val;

    }
    void set(int index, int val)throws Error{
        if(index==size-1){
            tail.val=val;
        }
        else if(index>=size|| index<0){
            // System.out.println("invaid index");
            // return -1;
            throw new Error("invalid Index== my first own made error");
        }
        Node temp=head;
        for (int i=0; i<index; i++) {
            temp=temp.next;    
        }
        temp.val=val;    
    }
    void deleteAtIndex(int idx)throws Error{
        //if(head==null) throw new Error("list is empty");
        if(idx >=size){
            throw new Error("index out of bound");
        }

        Node temp=head;
        if(idx==0) head=head.next;
        for (int i = 0; i <idx-1; i++) {
            temp=temp.next;    
        }
        if(temp.next==tail)tail=temp;
        temp.next=temp.next.next;
        size--;
    }
    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    } 
    public static void displaynode( Node middle) {
            //Node middle = middleNode(head); // Find the middle node
            Node temp = middle;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println(); // Move to the next line after displaying the list
        }     
    }
    
    public class implementationLL {
        
        public static void main(String[] args) {
            SLL list =new SLL();
            list.insertAtTail(10);
            list.insertAtTail(20);
            list.insertAtTail(30);
            list.insertAtTail(40);
            list.insertAtTail(50);
            list.insertAtHead(5);
    
    
             // Display the list before finding the middle
             System.out.print("Linked list: ");
             list.display(); // Output: 5 10 20 30 40 50
    
             // Call the static method to find the middle node
            Node middle = SLL.middleNode(list.head); // Passing the head of the list
            System.out.println("Middle Node: " + middle.val); // Output: 30
    
            // idsplay node
            SLL.displaynode(middle);
            SLL.displaynode(list.head);

        
       
    //    list.insert(2, 15);
    //    list.display();
    //     System.out.println(list.size);

    //     System.out.println(list.get(99));

    //     list.set(3,45);
    //     list.display();
        
    //     list.deleteAtIndex(list.size-1);
    //     list.display();
    //     System.out.println("list size "+ list.size);
    //     System.out.println(list.tail.val);  
    
    }

}
