class A{
	void fun(){
		System.out.println("This is fun");
	}
}

class B extends A{
	
}

/* Multiple Inheritance, not supported in Java
class D extends A,B{
	
}*/

interface I1{
	void show(); // public abstract void show();
}

interface I2{
	void hello(); // public abstract void hello();
	void show(); // public abstract void show();
}

interface I3 extends I1,I2{
	void bye();
}

class C implements I3{//I1,I2{
	
	C(){
		System.out.println("C Oject Created..");
	}
	
	public void show(){
		System.out.println("This is show");
	}
	
	public void hello(){
		System.out.println("This is hello");
	}
	
	public void bye(){
		System.out.println("This is bye");
	}
}

public class InfDemo {

	public static void main(String[] args) {
	
		/*C c = new C();
		c.show();*/
		
		//I1 i1 = new C(); // Polymorphic Statement
		//i1.show();
		//i.hello(); //error
		
		//I2 i2 = new C();
		//i2.hello();
		//i2.show(); // error
		
		// DownCasting
		/*I2 i2 = (C)i1; // reference copy
		i2.hello();
		
		C c = (C)i2;
		c.show();
		c.hello();*/
		
		I3 i3 = new C();
		i3.show();
		i3.hello();
		i3.bye();
	}

}
