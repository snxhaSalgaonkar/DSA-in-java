package OOPSjava.basic;
//import java.util.Scanner;

public class studentClass {
    public static class Student{//blueprint 
        String name;
        private int rno;
        double percent;
    }
    
    public static void change(Student s){
        s.name="neha";
    }
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        Student x1=new Student();//declaration
        x1.name="sneha";
        x1.rno=67;
        x1.percent=92.7;
       
        //oblects are real life entities 
        //objects are instance of class
        //classes are blueprint
        


        System.out.println(x1.name);
        change(x1);
        System.out.println(x1.name);
        System.out.println(x1.rno);



        

    }

}
