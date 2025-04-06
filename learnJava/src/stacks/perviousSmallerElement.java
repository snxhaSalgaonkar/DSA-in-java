package stacks;

import java.util.Stack;

public class perviousSmallerElement {
     public static void print(int[] result){
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+ " ");
        }
        System.out.println();
    }
    public static int[] fun(int[] arr){
        int n=arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(0);

        int[] ans=new int[n];
        ans[0]=-1;
        

        for(int i=1; i<n;i++){
            int x=arr[i];
            while(st.size()!=0 && x<arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0) ans[i]=-1;
            else ans[i]= st.peek();
            st.push(i);   
        }
        return ans;

    }
    public static void main(String[] args) {
        
        //return the index of that element
        int[] arr ={5,2,4,6,3,5};
        print(arr);
        int[] ans = fun(arr);
        print(ans);
    }

}
