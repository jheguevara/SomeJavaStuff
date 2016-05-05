package com.mcnz.moshape;

public class Triangle extends Shape  implements Surface{
	
	
	public Triangle( int x, int y ) {
		height = x;
		width = y;
	}
	
	public int calcArea() {
		//int area = (height * width) / 2;
		int area = super.calcArea() / 2;
		return area;
	}

}
