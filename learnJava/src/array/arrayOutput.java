package array;



public class arrayOutput {
    public static void main(String[] args) {
        
        int[] arr = new int[5];
        
       
        arr[0]=100; // if you didn't give the array value "0" will be printed
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
