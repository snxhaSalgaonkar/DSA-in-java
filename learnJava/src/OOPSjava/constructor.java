package OOPSjava;

public class constructor {
    public static void main(String[] args) {
    
        Student.noofstu=100;
        System.out.println(Student.noofstu);
        Student s =new Student("sneha",54,89.7);
        Student s1 =new Student("neha",54,89.7);
        Student s2 =new Student("neha",54,89.7);
        System.out.println(s.name);
        //System.out.println(s.rno);//rno is private
        System.out.println(s.getrno());
        //s.scname="bbps"; scname is final so cant be changed only used 
        System.out.println(s.scname);
        System.out.println(s.noofstu);
        System.out.println(Student.getnoofstu());
        
    }
    
    
    
    

}
