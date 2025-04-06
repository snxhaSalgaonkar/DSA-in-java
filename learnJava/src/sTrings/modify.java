package sTrings;

public class modify {
    public static void main(String[] args) {
        String a = "indian festival";
        String b= "";
        for (int i = 0; i <a.length(); i++) {
            if(i%2==0)b = b+ 'a';
            else b=b+ a.charAt(i);   
        }
        a = b;
        System.out.println(b);
        System.out.println(b.length());
    }

}
