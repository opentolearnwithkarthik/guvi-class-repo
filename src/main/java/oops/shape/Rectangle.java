package oops.shape;

public class Rectangle extends TwoDimension {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getPerimeter() {
		return 2 * (length + breadth);
	}

	@Override
	public double getArea() {
		return length * breadth;
	}

}
