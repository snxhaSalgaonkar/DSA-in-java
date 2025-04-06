package OOPSjava;

public class Student {
    //blueprint 
        public String name;
         private int rno;
        double percent;
        final String scname="MMHS";
        // private static int noofstu;
         static int noofstu;
        public Student(){//default ko bachane kelye   

        }

        public Student(String nam, int roll, double per){//constructer
            this.name = nam;
            this.rno=roll;
            this.percent=per;
            noofstu++;

        }
        public static int getnoofstu(){//static bcus noofstu is a static function
            return noofstu;
        }

        public int getrno(){//getter
            return rno;
        }
        public void setrno(int num){//getter
            this.rno=num;
        }
}




