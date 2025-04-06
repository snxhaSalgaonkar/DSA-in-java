package bubbleSort;

public class q2PushZero {
    public static void print(int[]arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //int[]arr = {0,2,0,5,8,0,3,7,0,6};
        int[] arr={2,5};
        int n =arr.length;
        print(arr);

        for(int x=0;x<n-1;x++){
            boolean flag = true;
            for (int i = 0; i <n-1-x; i++) {
                    if(arr[i]==0||arr[i+1]!=0){
                    int temp =arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag = false;
                }
            }
            if(flag==true)break;
        }
        print(arr);
    }

}
