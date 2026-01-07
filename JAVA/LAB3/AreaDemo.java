import java.util.Scanner;

class Area {

    // Area of Circle
    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.printf("Area of Circle = %.2f" , result);
    }

    // Area of Square
    void area(int side) {
        int result = side * side;
        System.out.printf("Area of Square = %.2f" , result);
    }

    // Area of Triangle
    void area(double base, double height) {
        double result = 0.5 * base * height;
        System.out.printf("Area of Triangle = %2.f" , result);
    }
}

public class AreaDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.println("Choose Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter radius of circle: ");
                double r = sc.nextDouble();
                obj.area(r);
                break;

            case 2:
                System.out.print("Enter side of square: ");
                int s = sc.nextInt();
                obj.area(s);
                break;

            case 3:
                System.out.print("Enter base of triangle: ");
                double b = sc.nextDouble();
                System.out.print("Enter height of triangle: ");
                double h = sc.nextDouble();
                obj.area(b, h);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

