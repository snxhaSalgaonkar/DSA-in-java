package sTrings;

public class subString {
    public static void main(String[] args) {
        String  s = "sneha";
        // System.out.println(s.substring(1));
        // System.out.println(s.substring(1,4));
        // //this get from i to j-1
        // System.out.println(s.substring(2,2));//nothing
        // System.out.println(s.substring(0,5 ));

        //print all sub string
        for (int i = 0; i <s.length(); i++) {
            for (int j =i+1; j <=s.length(); j++) {
                System.out.print(s.substring(i, j) + " ");
                
            }
            System.out.println();
            
        }

    }

}
