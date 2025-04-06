package stacks;
class node{
    int val;
    node next;
    node(int val){//constructor
        this.val =val;
    }
}

public class linkedListImplimentation {
    public static class LLstack{
        node head=null;
        int size=0;
        void push(int x){
            node a = new node(x);
            a.next = head;
            head=a;
            size++;    
        }
        int pop(){
            if(head==null){
                System.out.println("Empty stack");
                return -1;
            }
            int x= head.val;
            head = head.next;
            size--;
            return x;

        }
        int size(){
            return size;
        }
        void displayInReverse(){
            node temp =head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(head==null)return true;
            else return false;
        }


        void display(){
            displayRecurrsion(head);
            System.out.println();
        }
        void displayRecurrsion(node h){
            if(h==null)return;
            displayRecurrsion(h.next);
            System.out.print(h.val+ " ");
        }


    }

    public static void main(String[] args) {
        LLstack st = new LLstack();
        st.push(10);//10
        st.push(20);// 10 20
        st.push(30);//10 20 30 
        st.push(40);//10 20 30 40 
        st.push(50);//10 20 30 40 50
        st.display();
        System.out.println("size: "+ st.size());//3
        st.pop();//10 20 30 40 
        st.display();
        st.push(60);//10 20 30 40 60
        System.out.println(st.isEmpty());
        
        st.push(70);
        st.display();
        System.out.println("size: "+ st.size());
    }

}
