//Create A Class Employee With Data Members 
//name 
//Age basic Pay
//Create A subclass programmers With Datamembers department and bonus
//and also a method total salary which calculate total salary
//in the main class create object for only the subclass 
//and display the following details 
//name
//age 
//department
//total salary


class Employee {
    String Name;
    int age;
    float Basic_Pay;
}

class Programmers extends Employee {
    String department;
    float bonus;
 

    Programmers(String N, int A, float B_Pay, float bns, String dept) {
        Name = N;
        age = A;
        Basic_Pay = B_Pay;
        bonus = bns;
        department = dept;
    }

    void totalsalary() {
    float totalSalary = Basic_Pay + bonus;

    System.out.println("Name = " + Name);
    System.out.println("Age = " + age);
    System.out.println("Department = " + department);
    System.out.println("Total Salary = " + totalSalary);
    System.out.println();
}


}

public class ThirtyFour {
    public static void main(String[] args) {
        Programmers A=new Programmers("Suni", 18, 1500, 50, "cs");
        Programmers B=new Programmers("Biju", 20, 3500, 550, "Maths");
        A.totalsalary();
        B.totalsalary();     
    }
}
