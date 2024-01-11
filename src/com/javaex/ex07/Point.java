package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	//equals() 메소드를 작성하세요.
	public boolean equals(Object obj) {
		
		Point p = (Point)obj;
		boolean result;
		
		if(this.x == p.x) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
}
