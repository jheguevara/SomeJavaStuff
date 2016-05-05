package com.mcnz.shape;

public class Square extends java.lang.Object {
	
	int side;
	
	public Square(int s) {
		side = s;
	}
	
	public int calcArea(){
		//return (int)Math.pow(side, 2);
		return side * side;
	}

}
