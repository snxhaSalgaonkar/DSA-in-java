package loops;

public class question {
    public static void main(String[] args) {
        
        // }while(x==1)
        // x=x-1;
        // System.out.println(x);

        // int i=1 ;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;

        int x=4, y=0;
        while(x>=0){
            x--;
            y++;
            if(x==y) continue;
            else System.out.print(x+" "+y);
        }


    }

}
