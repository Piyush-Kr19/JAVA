/*1.Illustrate the usage of abstract class with following Java classes –
An abstract class ‘student’ with two data members roll no, reg no,
a method getinput and an abstract method course
A subclass ‘kiitian’ with course method implementation.

	Write the driver class to print the all details of a kiitian object.*/


import java.util.Scanner;

abstract class student{
    int rollno;
    int regNo;

    void getInput(){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the roll no. of the student: ");
        rollno = s.nextInt();
        System.out.print("Enter the registration no of the student: ");
        regNo = s.nextInt();        
    }

    abstract void cousre(){
        
    }
}