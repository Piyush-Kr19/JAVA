/*4.Define an interface Employee with a method getDetails to get employee details as Empid and Ename.
Also define a derived interface Manager with a method getDeptDetails to get department details such as Deptid and Deptname.
Then define a class Head which implements Manager interface and also prints all details of the employee.
Write the complete program to display all details of one head of the department. */


import java.util.Scanner;

interface Employee {

    void getDetails();
}

interface Manager extends Employee{
    
    void getDeptDetails();
}

class Head implements Manager{

    int Empid;
    int Deptid;
    String Ename;
    String Deptname;

    Scanner s = new Scanner(System.in);
    public void getDetails(){
        System.out.print("Enter the employee id: ");
        Empid = s.nextInt();
        s.nextLine();
        System.out.print("Enter the employee name: ");
        Ename = s.nextLine();
        
    }

    public void getDeptDetails(){
        System.out.print("Enter the department id: ");
        Deptid = s.nextInt();
        s.nextLine();
        System.out.print("Enter the department name: ");
        Deptname = s.nextLine();
    }    

    public void display(){
        System.out.println("\n--- Head of Department Details ---");
        System.out.println("Employee ID   : " + Empid);
        
        System.out.println("Employee Name : " + Ename);
        System.out.println("Department ID : " + Deptid);
        System.out.println("Department Name: " + Deptname);
    }

}

public class Driver {

    public static void main(String[] args) {
        
        Head h = new Head();

        h.getDetails();
        h.getDeptDetails();
        h.display();
    }

}