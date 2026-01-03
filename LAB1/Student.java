import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String name;
        int rollno;
        String section;
        String branch;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter name ,rollno, section and branch: ");
        name = s.next();
        rollno = s.nextInt();
        section = s.next();
        branch = s.next();

        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);
    }
}