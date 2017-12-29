package com.auribises.threads;

class Point{
	
	int x,y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("this is: "+this);
	}
	
	public String toString() {
		return "Point is: "+x+" : "+y+"\nParent toString: "+super.toString();
	}
}
public class ThisDemo {

	public static void main(String[] args) {
			
		Point p1 = new Point(10, 20);
		System.out.println(p1);
		
	}
}
