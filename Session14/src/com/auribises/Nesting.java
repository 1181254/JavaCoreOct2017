package com.auribises;

/*class Outer{
	
	Inner iRef; // HAS-A Relation
	
	
	void setInner(Inner i){
		iRef = i;
	}
	
	void show(){
		iRef.show();
		System.out.println("This is outer show");
	}
}

class Inner{
	void show(){
		System.out.println("This is inner show");
	}
}*/

class Outer{  // Composition
	
	int a;

	void show(){
		System.out.println("This is outer show");
	}
	
	class Inner{
		
		int b;
		
		void show(){
			System.out.println("This is inner show");
		}
	}
}

class SSystem{
	static PPrintStream oout = new PPrintStream();
}

class PPrintStream{
	
	void pprintln(String str){
		System.out.println(str);
	}
}


public class Nesting {

	public static void main(String[] args) {
	
		/*Outer o = new Outer();
		Inner i = new Inner();
		
		o.setInner(i);
		
		o.show();*/
		
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		
		o.show();
		i.show();
		
		SSystem.oout.pprintln("Hello");

	}
	
	//Ssystem.oout.pprintln("Hello");

}
