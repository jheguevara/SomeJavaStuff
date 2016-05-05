package com.mcnz.shape;

public class ShapeTester {
	
	
	public static boolean compareCircleToSquare(Circle circle, Square square) {
		
		return circle.calcArea() == square.calcArea();
	}

	public static boolean compareRectangleToSquare(Rectangle rectangle, Square square) {
		
		return rectangle.calcArea() == square.calcArea();
	}
	
	public static boolean compareSquareToSquare(Square square1, Square square2) {
		
		return square2.calcArea() == square1.calcArea();
	}
	
	
	
	public static void main(String[] args) {
		
		Point origin = new Point(0,0);
		Point centuryPoint = new Point(100,100);
		Point negativePoint = new Point(-30, -300);
		
		System.out.println(origin);
		System.out.println(origin.x);
		

		System.out.println(origin.calcArea());
		
		Line line1 = new Line(origin, centuryPoint);
		Line line2 = new Line(centuryPoint, negativePoint);

		System.out.println(line1.calcArea());
		System.out.println(line2.getLength());

		Circle c = new Circle(5);
		//circle.radius = 5;
		System.out.println(c.calcArea());
		
		Square s = new Square(5);
		ShapeTester.compareCircleToSquare(c, s);
		

		Rectangle r1 = new Rectangle(10,4);
		//r1.height = 10;
		//r1.width = 4;
		System.out.println(r1.calcArea());

		Triangle t1 = new Triangle(20, 4);
		//t1.height = 20;
		//t1.width = 4;
		System.out.println(t1.calcArea());

		System.out.println(t1.calcArea() == r1.calcArea());

		System.out.println();
		System.out.println();
	}
}
