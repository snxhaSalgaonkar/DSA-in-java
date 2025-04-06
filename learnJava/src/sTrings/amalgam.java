package sTrings;

public class amalgam {
    
    public static void main(String[] args) {
    String s = "matha";
    String t = "thama";
    char[] sc=s.toCharArray();
    char[] tc=t.toCharArray();
    
    int count=0;
    for (int i = 0; i < sc.length; i++) {
        for (int j = 0; j < tc.length; j++) {
            if(sc[i]==tc[j]){
                count++;
                break;
            }
        }
    }
    if(count==sc.length)System.out.println("true amalgam");
    else System.out.println("false amalgam");
    }
   



}
