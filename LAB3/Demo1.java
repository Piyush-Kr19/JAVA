/*Write a program in Java to create a class Rectangle having data members 	length and breadth and 
three methods called read, calculate and display to read the values of length and breadth,
calculate the area and perimeter of the rectangle and display the result respectively */

import java.util.Scanner;

// Rectangle class
class Rectangle {
    float length, breadth;
    float area, perimeter; 

    // Method to read values
    void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = sc.nextFloat();

        System.out.print("Enter breadth: ");
        breadth = sc.nextFloat();
    }

    // Method to calculate area and perimeter
    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    // Method to display result
    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}

// Application class
public class Demo1 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        // Unnamed Objects
        // new Rectangle().read();
        // new Rectangle().calculate();
        // new Rectangle().display();

        r.read(); // read values
        r.calculate(); // calculate area & perimeter
        r.display(); // display result
    }
}
