package com.mcnz.moshape;

public class Circle {
	
	int radius;
	
	public Circle(int r) {
		radius = r;
	}
	
	public int calcArea() {
		return (int) (Math.PI * radius * radius);
	}

}
