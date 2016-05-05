package com.mcnz.moshape;

public class ShapeTester {
	
	public static boolean compareShapes(Surface objectA, Surface objectB) {
		return objectA.calcArea() == objectB.calcArea();
	}

	public static void main(String[] args) {
		
		//Shape shape = new Shape();
		
		Rectangle r1 = new Rectangle();
		r1.height = 5;
		r1.width = 10;
		System.out.println(r1.calcArea());

		Square s1 = new Square(5);
		System.out.println(s1.calcArea());
		
		Point p1 = new Point();
		System.out.println(p1.height);
		System.out.println(p1.calcArea());
		
		Line line = new Line();
		System.out.println(line.calcArea());
		
		Triangle t1 = new Triangle(10,10);
		System.out.println(t1.calcArea());
		
		Circle c1 = new Circle(10);
		
		ShapeTester.compareShapes(c1, t1);
		
		System.out.println(ShapeTester.compareShapes(r1, r1));
		System.out.println(ShapeTester.compareShapes(r1, p1));
		System.out.println(ShapeTester.compareShapes(p1, p1));
		System.out.println(ShapeTester.compareShapes(r1, t1));
		System.out.println(ShapeTester.compareShapes(line, p1));
		System.out.println(ShapeTester.compareShapes(line, t1));

	}

}
