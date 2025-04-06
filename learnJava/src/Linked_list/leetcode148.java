package Linked_list;



public class leetcode148 {
    public static int length(Listnode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;    
        }
        return count;
    }
    public static void merge(Listnode a, Listnode b, Listnode head){
        Listnode temp=head;
        while(a!=null && b!=null){
            if(a.val>b.val){//b small
               temp.val=b.val;
               b=b.next;
            }
            else {//a small
               temp.val=a.val;
               a=a.next;
            }
            temp=temp.next;
        }
        if(b==null){
            while(a!=null){
                temp.val=a.val;
               a=a.next;
               temp=temp.next;
            }
        }
        else{
            while(b!=null){
                temp.val=b.val;
               b=b.next;
               temp=temp.next;
            }

        }
        head=temp;
    }

    public static void mergesort(Listnode head){
        int n=length(head);
        if(n==1)return;
        Listnode a =head;
        Listnode b;
        for(int i=1; i<n/2;i++){
            a=a.next;
        }
        b=a.next;
        a.next=null;
        a=head;

        mergesort(a);
        mergesort(b);
        merge(a,b,head);


    }

    public static void main(String[] args) {

        Listnode node5 = new Listnode(5);
        Listnode node4 = new Listnode(4, node5);
        Listnode node3 = new Listnode(3, node4);
        Listnode node2 = new Listnode(2, node3);
        Listnode head = new Listnode(1, node2);
        Listnode.display(head);  
       // if(head==null|| head.next==null) return head;
         //n=lenght(head);
        mergesort(head);
        // return head;
        
    }

}
