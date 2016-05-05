package com.mcnz.shape;

public class Triangle {

	int height;
	int width;
	
	public Triangle(int h, int w) {
		height = h;
		width = w;
	}
	
	public int calcArea() {
		return (height * width) / 2;
	}
	
}
