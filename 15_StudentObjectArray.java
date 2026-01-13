
class student{
    int roll;
    String name;
    int m1,m2,m3;
    student(){
        roll=0;
        name="";
        m1=0;
        m2=0;
        m3=0;
    }
    student(int r,String s,int a,int b,int c){
        roll=r;
        name=s;
        m1=a;
        m2=b;
        m3=c;
    }
    public void display(){
        System.out.println("Roll NO: "+roll);
        System.out.println("Name: "+name);
        int t=m1+m2+m3;
        System.out.println("Total Marks: "+t);
        double avg = (double)t/3;
        System.out.println("Average Marks: "+avg);
    }
}
public class ThirtyThree{
    public static void main(String args[]){
    student s[]=new student[3];
    s[0]=new student(100,"abc",10,12,14);
    s[1]=new student(101,"pqr",20,12,18);
    s[2]=new student(102,"xyz",15,11,19);
    System.out.println("Student Record");
    for(int i=0;i<3;i++)
    {
        s[i].display();
    }
    }
}

