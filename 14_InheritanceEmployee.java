// Create A Class Employee With Data Members 
// name 
// Age basic Pay
// Create A subclass programmers With Datamembers department and bonus
// and also a method total salary which calculate total salary
// in the main class create object for only the subclass 
// and display the following details 
// name
// age 
// department
// total salary


class Employee {
    String name;
    int age;
    float basicPay;

    Employee(String name, int age, float basicPay) {
        this.name = name;
        this.age = age;
        this.basicPay = basicPay;
    }
}

class Programmers extends Employee {
    String department;
    float bonus;

    Programmers(String name, int age, float basicPay, float bonus, String department) {
        super(name, age, basicPay);
        this.bonus = bonus;
        this.department = department;
    }

    void totalSalary() {
        float totalSalary = basicPay + bonus;
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Department = " + department);
        System.out.println("Total Salary = " + totalSalary);
        System.out.println();
    }
}

public class ThirtyFour {
    public static void main(String[] args) {
        Programmers a = new Programmers("Suni", 18, 1500, 50, "cs");
        Programmers b = new Programmers("Biju", 20, 3500, 550, "Maths");
        a.totalSalary();
        b.totalSalary();     
    }
}
