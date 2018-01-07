/*class Cab{
	
	Cab(){
		System.out.println("Cab Object Created");
	}
	
	void show(){
		System.out.println("This is a Cab");
	}
}*/

interface Cab{
	void show(); // public abstract void show();
	void fun();
}

class MicroCab implements Cab{//extends Cab{
	
	MicroCab(){
		System.out.println("MicroCab Object Created");
	}
	
	public void show(){
		System.out.println("This is a micro cab");
	}
	
	public void fun(){
		System.out.println("This is micro fun");
	}
}

class MiniCab implements Cab{//extends Cab{
	
	MiniCab(){
		System.out.println("MiniCab Object Created");
	}
	
	public void show(){
		System.out.println("This is a mini cab");
	}
	
	public void fun(){
		System.out.println("This is mini fun");
	}
}

class A{
	
}

class B{
	
}

/*class C extends A,B{ error
	
}*/

interface inf1{
	
}

interface inf2{
	
}

class C implements inf1,inf2{
	
}


public class RTP {

	public static void main(String[] args) {
		
		//Cab c;
		//c = new Cab();
		//c.show();

		//MicroCab m;
		//m = new MicroCab();
		//m.show();
		
		Cab c;
		c = new MicroCab(); // Polymorphic Statement
		c.show();
		
		c = new MiniCab();
		c.show();
		
	}

}
