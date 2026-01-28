// Illustrate the execution of constructors in multi-level inheritance with three Java classes – plate(length, width),
// box(length, width, height), woodbox (length, width, height, thick) where box inherits from plate and woodbox inherits from box class.
// Each class has constructor where dimensions are taken from user


import java.util.Scanner;

class Plate {
    protected double length;
    protected double width;

    public Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor called");
        System.out.println("Length: " + length + ", Width: " + width);
    }

    void display() {
        System.out.println("Plate length = " + length);
        System.out.println("Plate width  = " + width);
    }
}

class Box extends Plate {
    private double height;

    Box(double length, double width, double height) {
        super(length, width); // calls Plate constructor
        this.height = height;
        System.out.println("Box constructor called");
        System.out.println("Height = " + height);
    }

    void display() {
        super.display();
        System.out.println("Box height = " + height);
    }
} 

class WoodBox extends Box {
    private double thick;

    WoodBox(double length, double width, double height, double thick) {
        super(length, width, height); // calls Box constructor
        this.thick = thick;
        System.out.println("WoodBox constructor called");
        System.out.println("Thickness = " + thick);
    }

    void display() {
        super.display();
        System.out.println("WoodBox thickness = " + thick);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter length, width, height and thickness:");
        double l = s.nextDouble();
        double w = s.nextDouble();
        double h = s.nextDouble();
        double t = s.nextDouble();

        WoodBox wb = new WoodBox(l, w, h, t);

        System.out.println("\n--- Display Details ---");
        wb.display();
    }
}
