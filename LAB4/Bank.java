/*Write a class Account containing acc_no, balance as data members and two methods as input for taking input from user and disp method to display the details.
Create a subclass Person which has name and aadhar_no as extra data members and override disp function. 
Write the complete program to take and print details of three persons*/

import java.util.Scanner;

class Account {
    protected int accNo;
    protected double balance;

    public void input(Scanner s) {
        System.out.print("Enter Account Number: ");
        accNo = s.nextInt();
        System.out.print("Enter Balance: ");
        balance = s.nextDouble();
    }

    public void disp() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    private String name;
    private long aadharNo;

    public void input(Scanner s) {
        System.out.print("Enter Name: ");
        s.nextLine();
        name = s.nextLine();

        System.out.print("Enter Aadhar Number: ");
        aadharNo = s.nextLong();

        super.input(s);
    }

    @Override
    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadharNo);
        super.disp();
    }
}

public class Bank {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Person[] persons = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of Person " + (i + 1));
            persons[i] = new Person();
            persons[i].input(s);
        }

        System.out.println("\n--- Person Details ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1));
            persons[i].disp();
        }
    }
}