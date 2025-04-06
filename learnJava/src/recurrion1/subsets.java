package recurrion1;
import java.util.ArrayList;

public class subsets {
    static ArrayList<String> arr =new ArrayList<>();

    public static void subsets(String s, int i,String ans){
        if(i==s.length()){
            arr.add(ans);
            return;
        }
        char ch =s.charAt(i);
        subsets(s,i+1, ans+ch);//take 
        subsets(s, i+1, ans);//not take
    }
    
    public static void main(String[] args) {
        String s="abcd";
        arr = new ArrayList<>();
        subsets(s,0,"");
        System.out.println(arr);
    }
    

}
