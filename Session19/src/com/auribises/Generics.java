package com.auribises;

class Employee{
	int eid;
	String name;
	
	public String toString() {
		return "Eid - "+eid+" Name - "+name;
	}
}

class Point<T,U>{
	
	T x;
	T y;
	U z;
	
	void setPoint(T x, T y){
		this.x = x;
		this.y = y;
	}
	
	void showPoint(){
		System.out.println("Point is: "+x+" : "+y);
	}
	
}

public class Generics {

	public static void main(String[] args) {
		Point<Integer,Float> p1 = new Point<Integer,Float>();
		Point<Float,Float> p2 = new Point<Float,Float>();
		Point<String,Float> p3 = new Point<String,Float>();
		
		p1.setPoint(10, 20);
		p2.setPoint(2.2f, 1.1f);
		p3.setPoint("Alpha", "Beta");
		
		p1.showPoint();
		p2.showPoint();
		p3.showPoint();
		
		Employee e1 = new Employee();
		e1.eid = 101;
		e1.name = "John";
		
		Employee e2 = new Employee();
		e2.eid = 201;
		e2.name = "Jennie";
		
		System.out.println(e1);
		System.out.println(e2);
		
		Point<Employee,Float> p4 = new Point<Employee,Float>();
		p4.setPoint(e1, e2);
		p4.showPoint();
	}

}
