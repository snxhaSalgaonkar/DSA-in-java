package sTrings;

public class deleteandInstert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);//abde
        sb.append("xyz");
        System.out.println(sb);//abdexyz
        sb.delete(0, 1);
        System.out.println(sb);//bdexyz
        sb.insert(2,"kkk");
        System.out.println(sb);//bdkkkexyz
        sb.setCharAt(3, 'l');
        System.out.println(sb);//bdklkexyz
        sb.reverse();
        System.out.println(sb);

    }

}
