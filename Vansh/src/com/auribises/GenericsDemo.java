package com.auribises;

class Point<T,U>{
	
	T x,y;
	U z;
	
	Point(T p, T q, U r){
		x = p;
		y = q;
		z = r;
	}
	
	void showPoint(){
		System.out.println("Point is: "+x+" : "+y+" : "+z);
	}
}

public class GenericsDemo {

	public static void main(String[] args) {
		
		Point<Integer,Integer> p1 = new Point<Integer,Integer>(10, 20,1);
		p1.showPoint();
		
		Point<Float,Integer> p2 = new Point<Float,Integer>(10.1f, 20.2f,1);
		p2.showPoint();

		Point<String,Integer> p3 = new Point<String,Integer>("Hello", "Bye",1);
		p3.showPoint();
	}

}
