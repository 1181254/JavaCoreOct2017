class Parent{
	
	void purchaseBike(){
		System.out.println("Purchase Pulsar");
	}	
	
	static void purchaseCar(){
		System.out.println("Purchase Maruti");
	}
	
}

class Child extends Parent{
	
	// Overrding
	void purchaseBike(){
		System.out.println("Purchase Enfield");
	}
	
	// Hiding
	static void purchaseCar(){
		System.out.println("Purchase Honda");
	}
	
}

public class Overriding {

	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.purchaseBike();

		Child.purchaseCar();
	}

}
