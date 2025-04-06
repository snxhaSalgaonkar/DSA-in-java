package stacks;

import java.util.Stack;
//index

public class nextSmallerElement {
     public static void print(int[] result){
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+ " ");
        }
        System.out.println();
    }
    public static int[] fun(int[] arr){
        int n=arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);

        int[] ans=new int[n];
        ans[n-1]=-1;
        

        for(int i=n-2; i>=0;i--){
            int x=arr[i];
            while(st.size()!=0 && x<arr[st.peek()]){//change
                st.pop();
            }
            if(st.size()==0) ans[i]=-1;
            else ans[i]= st.peek();
            st.push(i);//change
            
        }
        return ans;

    }
    public static void main(String[] args) {
        //int[] arr = {1,3,2,1,8,6,3,4};
        //return the index of that element
        int[] arr ={5,2,4,6,3,5};
        print(arr);
        int[] ans = fun(arr);
        print(ans);
    }

}
