/*Create an interface IShape with the getArea() method. Create three classes
Rectangle, Circle, and Triangle that implement the IShape interface.
Implement the getArea() method for each of the three classes. */



import java.util.Scanner;

interface IShape{

    double getArea();
}

class Rectangle implements IShape{

    private double length;
    private double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea(){
        return length * width;
    }

}

class Circle implements IShape{

    private double radius;

    Circle(double raduis){
        this.radius = raduis;
    }
    
    @Override
    public double getArea(){
        return 3.14 * radius * radius;
    }
}

class Triangle implements IShape{

    private double height;
    private double base;

    Triangle(double base,double height){
        this.height = height;
        this.base = base;
    }
    
    @Override
    public double getArea(){
        return 0.5 * height * base;
    }

}

public class Driver{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length and breaadth of rectangle: ");
        IShape r = new Rectangle(s.nextDouble(), s.nextDouble());

        System.out.println("Enter the radius of Circle: ");
        IShape c = new Circle(s.nextDouble());

        System.out.println("Enter the base and height of Triangle: ");
        IShape t = new Triangle(s.nextDouble(), s.nextDouble());

        System.out.println("Area of Rectangle: " + r.getArea());
        System.out.println("Area of Circle: " + c.getArea());
        System.out.println("Area of Triangle: " + t.getArea());
    }
}