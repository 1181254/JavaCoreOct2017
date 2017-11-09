package com.auribises;

/*class Shape{
	
	Shape(){
		System.out.println("Shape Object Created..");
	}
	
	void draw(){
		System.out.println("Drawing a Shape..");
	}
}*/

/*abstract class Shape{
	
	Shape(){
		System.out.println("Shape Object Created..");
	}
	
	abstract void draw();
	
	void fun(){
		System.out.println("This is fun");
	}
	
}*/

interface Shape{
	
	/*Shape(){
		System.out.println("Shape Object Created..");
	}*/ // err
	
	void draw(); // public abstract void draw();
	
	/*void fun(){
		System.out.println("This is fun");
	}*/
	
}

class Rectangle implements Shape{//extends Shape{
	
	Rectangle() {
		System.out.println("Rectangle Object Created..");
	}
	
	public void draw(){
		System.out.println("Drawing a Rectangle..");
	}
}

class Circle implements Shape{//extends Shape{
	
	Circle() {
		System.out.println("Circle Object Created..");
	}
	
	public void draw(){
		System.out.println("Drawing a Circle..");
	}
}

class Triangle implements Shape{//extends Shape{
	
	Triangle() {
		System.out.println("Triangle Object Created..");
	}
	
	public void draw(){
		System.out.println("Drawing a Triangle..");
	}
}

public class RTPDemo {

	public static void main(String[] args) {
		
		/*Shape s;
		s = new Shape();
		s.draw();*/
		
		/*Rectangle r;
		r = new Rectangle();
		r.draw();*/
		
		Shape s;
		
		s = new Rectangle(); // Polymorphic Statement
		s.draw();// Dynamic Binding or Late Binding
		
		System.out.println("----------------------");
		s = new Circle();
		s.draw();
		
		System.out.println("----------------------");
		s = new Triangle();
		s.draw();
		
		System.out.println("----------------------");
		//s = new Shape();
		//s.draw();
		
	}

}
