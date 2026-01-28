// Write a program in java using constructor overloading concept to calculate the area of a rectangle having data member as length and breadth.
// Use default constructor to initialize the value of the data member to zero and parameterized constructor
// to initialize the value of data member according to the user input. 


import java.util.Scanner;

class Rect { 
    double length;
    double breadth;

    // Default constructor
    Rect() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    Rect(double l, double b) {
        length = l;
        breadth = b;
    }

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class RectArea{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Using default constructor
        Rect r1 = new Rect();
        System.out.println("Using Default Constructor:");
        r1.calculateArea();

        // Using parameterized constructor
        System.out.print("Enter length: ");
        double l = s.nextDouble();
        System.out.print("Enter breadth: ");
        double b = s.nextDouble();

        Rect r2 = new Rect(l, b);
        System.out.println("Using Parameterized Constructor:");
        r2.calculateArea();

    }
}


