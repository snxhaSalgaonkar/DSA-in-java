package sTrings;

import java.util.Scanner;

public class q9mostOccuringAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] sa= s.toCharArray();
        int[] arr = new int[26];
        //finding freq 
        for (int i = 0; i <sa.length; i++) {
            char ch =sa[i];
            int x=(int)ch;
            arr[x-97]++;   
        }
        //find max
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]>max)max=arr[i]; 
        }
        //getting most occured
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max){
                char c =(char)(i+97);
                System.out.println(c+ " is most occuring");   
            }    
        }
        sc.close();
    }
}
