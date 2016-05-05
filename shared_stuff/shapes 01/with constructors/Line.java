package com.mcnz.shape;

public class Line {
	
	Point startPoint;
	Point endPoint;
	
	public Line(Point start, Point end) {
		startPoint = start;
		endPoint = end;
	}
	
	//int startX;
	//int startY;
	//int endX;
	//int endY;
	
	public double getLength() {
		double length = 0;
		int deltaX = startPoint.x - endPoint.x;
		int deltaY = startPoint.y - endPoint.y;
		length = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
		return length;
	}
	
	public int calcArea() {
		return 0;
	}

}
