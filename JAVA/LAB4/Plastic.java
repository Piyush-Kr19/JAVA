// A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box.
// The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft.
// Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.

import java.util.Scanner;

class Sheet {
	protected double length;
	protected double width;
	static final double RATE = 40.0; // Rs per sq ft

	public Sheet(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double area() {
		return length * width;
	}

	public double cost() {
		return area() * RATE;
	}
}

class Box extends Sheet {
	protected double height;
	static final double RATE_BOX = 60.0; // Rs per cu ft

	public Box(double length, double width, double height) {
		super(length, width);
		this.height = height;
	}

	public double volume() {
		return length * width * height;
	}

	@Override
	public double cost() {
		return volume() * RATE_BOX;
	}
}

public class Plastic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose option: 1 - Sheet, 2 - Box");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();

		switch (choice) {
			case 1: {
				System.out.print("Enter length (ft): ");
				double l = sc.nextDouble();
				System.out.print("Enter width (ft): ");
				double w = sc.nextDouble();
				Sheet s = new Sheet(l, w);
				System.out.printf("Area: %.2f sq ft\n", s.area());
				System.out.printf("Cost: Rs %.2f\n", s.cost());
				break;
			}
			case 2: {
				System.out.print("Enter length (ft): ");
				double l = sc.nextDouble();
				System.out.print("Enter width (ft): ");
				double w = sc.nextDouble();
				System.out.print("Enter height (ft): ");
				double h = sc.nextDouble();
				Box b = new Box(l, w, h);
				System.out.printf("Volume: %.2f cu ft\n", b.volume());
				System.out.printf("Cost: Rs %.2f\n", b.cost());
				break;
			}
			default:
				System.out.println("Invalid choice. Please run again and choose 1 or 2.");
		}
	}
}
