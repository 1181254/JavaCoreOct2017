class Point{
	
	int x;
	int y;
	
	// Constructor | To Initialize the values of attributes in an object
	// Default Constructor
	Point(){
		x = 10;
		y = 20;
	}
	
	// Parmeterized Constructor
	Point(int p, int q){
		x = p;
		y = q;
	}
	
	void showPoint(){
		System.out.println("Point is: "+x+":"+y);
	}
}


public class Constructor {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		
		p1.x = 900;
		
		p1.showPoint();

		Point p2 = new Point(100,200);
		p2.showPoint();
		
	}

}
