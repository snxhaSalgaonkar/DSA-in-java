package queues.circularQueue;

public class ArrayImplimentationOfCircularQueue {
    public static class  queueArray {
        int f=0;
        int r =0;
        int size=0;
        int[] arr =new int[5];
        int n=arr.length;

        void add(int x) throws Exception{
            if(size==arr.length){ 
                throw new Exception("Queue is Full");   
            }
            else if(r==n)r=0;
            arr[r]=x;
            r++;
            size++;    
        }
        int remove()throws Exception{
            if(size==0){
                throw new Exception("Queue is empty");
                
            }
            int x= arr[f];
            f++;
            size--;
            if(f==arr.length)f=0;
            return x;
            
        }
        int peek()throws Exception{
            if(size==0){
                System.out.println("queue is empty");
                throw new Exception("Queue is empty");
                
            }
            return arr[f];
        }
        
        void print(){
            if(size==0)System.out.println("queue is empty");
            if(r>f){
                for(int i=f;i<r;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
                return;

            }

            for(int i=f;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0; i<r; i++){
                System.out.print(arr[i]+" ");
            }

            System.out.println();
        }   
    }
    
    public static void main(String[] args) throws Exception {
        queueArray q = new queueArray();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.print();//1 2 3 4 0

        q.add(5);
        q.print();//1 2 3 4 5

        q.add(6); //queue empty
        q.print(); //1 2 3 4 5

        q.remove();//2 3 4 5 
        q.print();

        q.add(7);
        System.out.println("peek:" +q.peek());
        q.print();
        System.out.println("size: "+q.size);
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        System.out.println("size: "+q.size);
    }

}
