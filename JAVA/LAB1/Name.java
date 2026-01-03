import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        String fname;
        String lname;
        // int age;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter first name and last name:");
        
        fname = s.next();
        lname = s.next();

        // System.out.print("Enter your age: ");

        // age = s.nextInt();

        System.out.println(lname + " " + fname);
        // System.out.println("Age: " + age + " years");
    }
}