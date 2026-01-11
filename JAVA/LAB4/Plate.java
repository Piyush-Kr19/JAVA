// Illustrate the execution of constructors in multi-level inheritance with three Java classes – plate(length, width),
// box(length, width, height), woodbox (length, width, height, thick) where box inherits from plate and woodbox inherits from box class.
// Each class has constructor where dimensions are taken from user


import java.util.Scanner;

class Plate {
    protected double length;
    protected double width;

    public Plate(double length, double width){
        this.length = length;
        this.width = width;
        System.out.println("Plate created with length: " + length + " and width: " + width);
    }
}