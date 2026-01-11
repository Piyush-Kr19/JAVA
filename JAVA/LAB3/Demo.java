/* 1.Write a class file – box with three data members (length, width, height) 	and a method volume. 
Also implement the application class Demo where an object of 
the box class is created with user entered dimensions and volume is printed.*/

import java.util.Scanner;

// Box class
class Box {
    double length, width, height;

    // Method to calculate volume
    double volume() {
        return length * width * height;
    }
}

// Application class
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Box b = new Box();

        System.out.print("Enter length: ");
        b.length = sc.nextDouble();

        System.out.print("Enter width: ");
        b.width = sc.nextDouble();

        System.out.print("Enter height: ");
        b.height = sc.nextDouble();

        System.out.println("Volume of the box = " + b.volume());
    }
}
