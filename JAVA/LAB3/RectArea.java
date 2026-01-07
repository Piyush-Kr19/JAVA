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

        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Rect r1 = new Rect();
        System.out.println("Using Default Constructor:");
        r1.calculateArea();

        // Using parameterized constructor
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        Rect r2 = new Rect(l, b);
        System.out.println("Using Parameterized Constructor:");
        r2.calculateArea();

        sc.close();
    }
}


