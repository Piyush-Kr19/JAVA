/*1.Illustrate the usage of abstract class with following Java classes –
~An abstract class ‘student’ with two data members roll no, reg no,
a method getinput and an abstract method course
~A subclass ‘kiitian’ with course method implementation.

Write the driver class to print the all details of a kiitian object.*/


import java.util.Scanner;

abstract class Student{ 
    int rollno;
    int regNo;
    String course;

    void getInput(){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the roll no. of the student: ");
        rollno = s.nextInt();

        System.out.print("Enter the registration no of the student: ");
        regNo = s.nextInt();    
        
        s.nextLine(); // consume newline
        System.out.print("Enter Course Name: ");
        course = s.nextLine();
    }
        abstract void course();
}

class Kiitian extends Student{

    void course(){
        System.out.print("Course: " + course);
    }

    void display(){
        System.out.println("Roll no: " + rollno);
        System.out.println("Reg no: " + regNo);
        course();
    }   
}

public class Demo1{

    public static void main(String[] args) {
        
        Kiitian k = new Kiitian();
        k.getInput();
        k.course();
        System.out.println("\nStudent Details:");
        k.display();
    }
}