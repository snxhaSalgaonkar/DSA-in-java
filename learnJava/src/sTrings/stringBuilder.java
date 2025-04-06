package sTrings;

public class stringBuilder {
    public static void main(String[] args) {
       
        StringBuilder sb = new StringBuilder("sneha");
        System.out.println(sb);
        System.out.println(sb.length());

        StringBuilder a = new StringBuilder();
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.capacity());
        // by default capacity is 16

        //to change
        sb.setCharAt(0, 'a');
        System.out.println(sb);


    }

}
