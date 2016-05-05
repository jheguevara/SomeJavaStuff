package com.mcnz.shape;

public class Rectangle {
	
	int height;
	int width;
	
	public Rectangle(int h, int w) {
		height = h;
		width = w;
	}
	
	public int calcArea(){
		return height * width;
	}

}
