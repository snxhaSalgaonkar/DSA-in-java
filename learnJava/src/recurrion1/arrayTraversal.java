package recurrion1;
//import java.util.Array;

public class arrayTraversal {
    public static void print(int[] arr,int i){
        if(i==arr.length)return;
    System.out.print(arr[i]+" ");
    print(arr,i+1);
    System.out.print(arr[i]+" ");

}    
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,8,9,1,2,3,};
        print(arr,0);   
    }
}
