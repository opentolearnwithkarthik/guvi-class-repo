package oops.shape;

public class Circle extends TwoDimension {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return radius * 2 * 3.14;
	}

	@Override
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
}
