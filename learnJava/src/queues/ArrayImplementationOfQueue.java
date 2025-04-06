package queues;


public class ArrayImplementationOfQueue {
    public static class  queueArray {
        int f=0;
        int r =0;
        int[] arr =new int[5];

        void add(int x){
            if(r==arr.length){
                if(f==0){
                    System.out.println("queue is full");
                    return;
                }
                else{
                    int i;
                    int j=f;
                    for( i=0; i<r-f;i++){
                        arr[i]=arr[j];
                        j++;
                    }
                    f=0;
                    r=i;
                }
            }
           arr[r]=x;
           r++;
        }
        int remove(){
            if(r-f==0){
                System.out.println("queue is empty");
                return 0;
            }
            int x= arr[f];
            f++;
            return x;
            
        }
        int peek(){
            return arr[f];
        }
        int size(){
            int s=r-f;
            return s;
        }
        void print(){
            if(r-f==0)System.out.println("queue is empty");
            for(int i=f;i<r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    
        
    }
    
    public static void main(String[] args) {
        queueArray q = new queueArray();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.print();

        q.add(5);
        q.add(6); 
        q.print();

        q.remove();
        q.print();

        q.add(7);
        q.print();
        System.out.println("size: "+q.size());
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.print();

        q.remove();
    }

}
