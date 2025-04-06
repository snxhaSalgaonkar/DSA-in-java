package stacks;

//import java.util.Stack;

public class arrayImplementation {
    public static class stack{
        int[] arr = new int[5];
        int idx =0;
        void push(int x){
            if(isFull()){
                System.out.println("stack is full");
                return;
            }
            arr[idx]=x;
            idx++;

        }
        int size(){
            return idx;
        }
        int peek(){
            if(idx==0){
                System.out.println("stack is Empty");
                return -1;
            }
           return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("stack is Empty");
                return -1;
            }
            int top= arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for (int i = 0; i <idx; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }

    }
    public static void main(String[] args) {
        stack st = new stack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.push(20);
        st.push(45);
        st.display();//4 5 1
        System.out.println(st.size());//3
        st.pop();
        st.display();//4 5 
        st.push(24);
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.size());
        st.push(45);

    }

}
