/*Write a program in java to input and display the details of n number of students having roll,
name and cgpa as data members. Also display the name of the student having lowest cgpa.*/

import java.util.Scanner;

// Student class
class Student {
    int roll;
    String name;
    float cgpa;

    // Method to read student details
    void read(Scanner s) {
        System.out.print("Enter roll number: ");
        roll = s.nextInt();

        s.nextLine(); // clear buffer

        System.out.print("Enter name: ");
        name = s.nextLine();

        System.out.print("Enter CGPA: ");
        cgpa = s.nextFloat();
    }

    // Method to display student details
    void display() {
        System.out.println(roll + "\t" + name + "\t" + cgpa);
    }
}

// Application class
public class Demo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));
            s[i] = new Student();
            s[i].read(sc);
        }

        // Display all students
        System.out.println("\nRoll\tName\tCGPA");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        // Find student with lowest CGPA
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < s[minIndex].cgpa) {
                minIndex = i;
            }
        }

        System.out.println("\nStudent with lowest CGPA:");
        System.out.println("Name: " + s[minIndex].name);
    }
}

