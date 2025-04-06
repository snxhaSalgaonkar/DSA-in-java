package array.methods;

//import java.util.Arrays;

public class shallowCopy {
    public static void main(String[] args) {
        int[] arr ={10, 20, 30, 99, 98, 60, 4, 5, 65,};

        //using for each loop
        for(int ele : arr){//for int ele in array
            System.out.print(ele+" ");
        }
        System.out.println();

        //to copy an array
        int[] nums = arr; //shallow copy
        nums[0]=70;
        System.out.println(arr[0]);
        for(int ele: nums){
            System.out.print(ele+ " ");
        }
    }
        

}
