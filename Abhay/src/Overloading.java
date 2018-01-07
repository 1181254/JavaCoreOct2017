// Compile Time Polymorphism
public class Overloading {

	void fun(){
		System.out.println("This is fun");
	}
	
	void fun(int a){
		System.out.println("This is fun again: "+a);
	}
	
	void fun(int a, int b){
		System.out.println("This is fun again: "+(a+b));
	}
	
	void fun(float a, float b){
		System.out.println("This is fun again: "+(a+b));
	}
	
	void fun(int a, float b){
		System.out.println("This is fun again: "+(a+b));
	}
	
	void fun(float a, int b){
		System.out.println("This is fun again: "+(a+b));
	}
	

	
	public static void main(String[] args) {
		
		Overloading oRef = new Overloading();
		oRef.fun();
		oRef.fun(10);
		oRef.fun(10,20);
		oRef.fun(10,20.2f);
		oRef.fun(10.1f,20.5f);
		

	}

}
