package com.auribises;

class A{
	void show(){
		System.out.println("This is show of A");
	}
	
	class B{
		void show(){
			System.out.println("This is show of B");
		}
	}
}

class C{
	
	private class A{
		
	}
	
	class B{
			
	}
	
	protected class D{
		
	}
	
	public class E{ // Nested Classes
		
	}
	
	void show(){
		class A{ // Local Class
			
		}
		
		A a = new A();
		
		//interface Inf3{ // Local Interfaces are not allowed
			
		//}
	}
	
	interface Inf{
		interface Inf1{
			
		}
	}
	
	static void statShow(){
		class A{
			
		}
	}
	
	
	
}

public class Nesting {

	public static void main(String[] args) {
		
		A a = new A();
		a.show();
		
		A.B b = a.new B();
		b.show();

	}

}
