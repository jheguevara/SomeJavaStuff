package com.mcnz.shape;

public class Circle {
	
	int radius;
	
	public Circle(int r) {
		radius = r;
	}
	
	public double calcArea() {
		double area = Math.PI * radius * radius;
		return area;
	}

}
