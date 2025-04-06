package Linked_list;
class Listnode {
    int val;
    Listnode head;
    Listnode next;
    Listnode() {}
    Listnode(int val) { 
        this.val = val; 
    }
    Listnode(int val, Listnode next) { 
          this.val = val; 
          this.next = next; 
    }

    int length(){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;    
        }
        return count;
    }
    public static void display(Listnode head){
        Listnode temp=head;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp =temp.next;
        }
        System.out.println("\n");
    }
}

public class leetcode {
    public static void main(String[] args) {
        //237 delete node
        // 876 middle element
        // 2095 delete the middle elemnet 
        // 19 delete the n th last node
        //1721 swaping nodes in a linked ist
        // 222 happy number
        //2326 spiral matrix IV
        //23 sort k linkedlist
        //86 partition linkedList
        //206 reverse LinkList
        //243 palindrone 
        //2130 maximun twin sum of a linked list
        


        Listnode node5 = new Listnode(5);
        Listnode node4 = new Listnode(4, node5);
        Listnode node3 = new Listnode(3, node4);
        Listnode node2 = new Listnode(2, node3);
        Listnode head = new Listnode(1, node2);
        Listnode.display(head);  


        
         }

}
