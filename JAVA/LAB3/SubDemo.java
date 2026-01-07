class Subtract {

    // Subtract two integers
    void subtract(int a, int b) {
        System.out.println("Subtraction of two integers: " + (a - b));
    }

    // Subtract three integers
    void subtract(int a, int b, int c) {
        System.out.println("Subtraction of three integers: " + (a - b - c));
    }

    // Subtract two double values
    void subtract(double a, double b) {
        System.out.println("Subtraction of two doubles: " + (a - b));
    }

    // Subtract integer and double
    void subtract(int a, double b) {
        System.out.println("Subtraction of int and double: " + (a - b));
    }
}

public class SubDemo {
    public static void main(String[] args) {

        // Creating object of Subtract class
        Subtract obj = new Subtract();

        // Calling different overloaded subtract methods
        obj.subtract(10, 5);           // int, int
        obj.subtract(20, 5, 3);        // int, int, int
        obj.subtract(10.5, 2.5);       // double, double
        obj.subtract(15, 4.5);         // int, double
    }
}

