/* Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service. */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Period;

public class Employee
{
   private String name;
   private double salary;
   private LocalDate hireDate;

   public void input()
   {
      Scanner scannerObject = new Scanner(System.in);
      System.out.print("Enter the name:");
      this.name = scannerObject.nextLine();

      System.out.print("Enter the salary:");
      this.salary = scannerObject.nextDouble();

      //Consume the leftover newline character
      //discard the newline character by nextDouble()
      scannerObject.nextLine();

      System.out.print("Enter the hiring date in (DD/MM/YYYY) format: ");
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      hireDate = LocalDate.parse(scannerObject.nextLine(), formatter);
   }

   public void display()
   {
      System.out.print(System.lineSeparator() + "Name:" + this.name + System.lineSeparator() + "Salary:" + this.salary + System.lineSeparator());
      LocalDate nowDate = LocalDate.now();
      Period period = Period.between(hireDate, nowDate);
      System.out.println("Year of service: " + period.getYears() + " years, " + period.getMonths() + " months, and " + period.getDays() + " days");
   }

   public static void main(String[] args)
   {
       Employee e = new Employee();
       e.input();
       e.display();
   }
}