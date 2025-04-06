package stacks;
import java.util.*;

public class removeConsecutiveSubSrquences {
    public static void print(int[] result){
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+ " ");
        }

    }
    public static int[] remove(int[] arr){
        int n=arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
    
        for (int i = 1; i<n; i++) {
            int x=arr[i];
            if(x==st.peek()){
                if(i==n-1 || arr[i]!=arr[i+1]){
                    st.pop();
                }   
            }
            else{
                st.push(x);       
            }   
        }
        int a=st.size();
        int[] ans=new int[a];
        for (int i =a-1 ; i>=0; i--) {
            ans[i]=st.pop();   
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr ={ 1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        // int[] result = remove(arr);
        int[] result = remove(arr);
        print(result);
    }
    


}
