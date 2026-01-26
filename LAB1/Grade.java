import java.util.Scanner;

public class Grade {
     public static void main(String[] args)
     {
        int mark;
        String grade;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter mark:");
        mark = s.nextInt();

        if (mark < 0 || mark > 100) 
            grade ="Invalid mark";
        else if(mark >= 90)
            grade = "O";
        else if (mark >= 80)
            grade = "E";
        else if (mark >= 70)
            grade = "A";
        else if (mark >= 60)
            grade = "B";
        else if (mark >= 50)
            grade = "C";
        else 
            grade = "F";

        System.out.println("Grade " + grade);
    }    
       
}
