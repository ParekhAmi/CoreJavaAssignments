abstract class Shape {

	private int numSides;

	public Shape(int numSides) {
		this.numSides = numSides;
	}

	public double numSides() {
		return numSides;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	public interface Resizable {
		public void resize();
	}
}

class Rectangle extends Shape implements Shape.Resizable {

	private double width, height;

	Rectangle(double i, double j) {
		super(4);
		this.width = i;
		this.height = j;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return (2 * (width + height));
	}

	public void resize() {
		System.out.println("In Interface............");

		double factor = 2;
		System.out.print("Factor of " + factor + "are: ");

		for (int i = 1; i <= factor; i++) {
			if (factor % i == 0) {
				System.out.print(i + " ");
			}
		}
		this.width = factor * this.width;
		this.height = factor * this.height;
		System.out.println("width of rectangle after resize is: " + this.width);
		System.out.println("height of rectangle after resize is: " + this.height);
	}
	
	public double getWidth() {
		return this.width;
	}

	public double getHeight() {
		return this.height;
	}
}


class Triangle extends Shape {
	double width, height, hypotenuse;

	Triangle(double i, double j, double k) {
		super(3);

		this.width = i;
		this.height = j;
		this.hypotenuse = k;
	}

	@Override
	public double getArea() {
		return (width * height) / 2;
	}

	@Override
	public double getPerimeter() {
//		hypotenuse = Math.pow(Math.pow(width, 2) + Math.pow(height, 2), 0.5);

		return width + height + hypotenuse;
	}
}


class Circle extends Shape {
	double radius;
	final double pi = Math.PI;

	Circle(double rad) {
		super(1);
		this.radius = rad;
	}

	@Override
	public double getArea() {
		return pi * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * pi * radius;
	}
}

public class Assignment3_Q_1 {

	
	public static void main(String args[]) {

		Shape rect = new Rectangle(2, 3);
		Shape tri = new Triangle(2, 3, 1);
		Shape cir = new Circle(5);

		System.out.format("Area of Rectangle is: %.2f\n", rect.getArea());
		System.out.format("Perimeter of Rectangle is: %.2f\n", rect.getPerimeter());

		Rectangle resizeRect = new Rectangle(0,0);

		resizeRect.resize();
		double w = resizeRect.getWidth();
		double h = resizeRect.getHeight();

		resizeRect = new Rectangle(w, h);

		System.out.format("Area of Rectangle after Resize: %.2f", resizeRect.getArea());
		System.out.format("Perimeter of Rectangle after resize: %.2f\n", resizeRect.getPerimeter());

		System.out.format("Area of Triangle is: %.2f\n", tri.getArea());
		System.out.format("Perimeter of Triangle is: %.2f\n", tri.getPerimeter());

		System.out.format("Area of Circle is: %.2f\n", cir.getArea());
		System.out.format("Perimeter of Circle is: %.2f\n", cir.getPerimeter());
	}
}
