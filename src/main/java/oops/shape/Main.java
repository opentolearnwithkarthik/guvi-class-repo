package oops.shape;

public class Main {
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(8, 4);
		System.out.println(r1.getPerimeter());
		System.out.println(r1.getArea());
		Square s1 = new Square(10);
		System.out.println(s1.getPerimeter());
		System.out.println(s1.getArea());
	}

}
