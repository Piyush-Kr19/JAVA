/*3.Define an interface with three methods earnings, deductions and bonus and define a Java class ‘Manager’ which uses this interface without implementing bonus method.
Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements bonus method. 
Write the complete program to find out earnings, deduction and bonus of a substaff with basic salary amount entered by the user as per the following guidelines –
Earnings           basic + DA (80% of basic) + HRA (15% of basic)
Deduction PF      	12% of basic
Bonus             50% of basic*/

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

interface Company{

    void earnings();
    void deductions();
    void bonus();
}

abstract class Manager implements Company{

    protected double basic;

    public Manager(double basic){
        this.basic = basic;
    }

    @Override
    public void earnings(){
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        double totalEarning = basic + da + hra;
        System.out.println("Earning: " + totalEarning);
    } 

    @Override
    public void deductions(){
        double pf = 0.12 * basic;
        System.out.println("Deduction PF: " + pf);
    }
}

class SubStaff extends Manager{


    public SubStaff(double basic){
        super(basic);
    }
    @Override
    public void bonus(){
        double bonus = 0.5 * basic;
        System.out.println("Bonus: " + bonus);
    }
}

public class Main2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.print("Basic Salary: ");
        double basic = s.nextInt();

        SubStaff ss = new SubStaff(basic);
        ss.bonus();
        ss.earnings();
        ss.deductions();
        
    }
}
    
