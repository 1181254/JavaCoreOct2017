/*class Shape{
	void draw(){
		System.out.println("Drawing a Shape");
	}
}*/

/*abstract class Shape{
	abstract void draw();
}*/

interface Shape{
	void draw(); // public abstract void draw();
}

class Circle implements Shape{//extends Shape{
	public void draw(){
		System.out.println("Drawing a Circle");
	}
}

class Rectangle implements Shape{//extends Shape{
	public void draw(){
		System.out.println("Drawing a Rectangle");
	}
}


public class RTP1 {

	public static void main(String[] args) {

		Shape s = new Circle();
		s.draw();
		
		s = new Rectangle();
		s.draw();
		
		//s = new Shape();
		
	}

}
