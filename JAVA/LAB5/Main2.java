/*3.Define an interface with three methods earnings, deductions and bonus and define a Java class ‘Manager’ which uses this interface without implementing bonus method.
Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements bonus method. 
Write the complete program to find out earnings, deduction and bonus of a substaff with basic salary amount entered by the user as per the following guidelines –
Earnings           basic + DA (80% of basic) + HRA (15% of basic)
Deduction PF      	12% of basic
Bonus             50% of basic*/


import java.util.Scanner;

interface Salary {
    void earnings();
    void deductions();
    void bonus();
}

abstract class Manager implements Salary {
    double basic;

    Manager(double basic) {
        this.basic = basic;
    }

    public void earnings() {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        double earnings = basic + da + hra;
        System.out.println("Earnings = " + earnings);
    }

    public void deductions() {
        double pf = 0.12 * basic;
        System.out.println("Deduction = " + pf);
    }
}

class Substaff extends Manager {

    Substaff(double basic) {
        super(basic);
    }

    public void bonus() {
        double bonus = 0.50 * basic;
        System.out.println("Bonus = " + bonus);
    }
}

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        Substaff s = new Substaff(basic);

        s.earnings();
        s.deductions();
        s.bonus();
    }
}
