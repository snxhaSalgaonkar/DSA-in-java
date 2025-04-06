package sTrings;

public class plusOperator {
    public static void main(String[] args) {
        String s = "abc";
        //s=s.concat("xyz");
        s=s+'z';
        s=10 +s;
        System.out.println(s);
        System.out.println("xyz"+(10+20));//xyz30
        System.out.println("xyz"+ 10+20);//xyz1020
        System.out.println(10+20+"xyz");//30xyz
        System.out.println(10+(20+"xyz"));//1020xyz

        

    }

}
