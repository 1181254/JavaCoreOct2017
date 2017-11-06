class Parent{
	void purchaseBike(){
		System.out.println("Lets purchase Pulsar");
	}
	
	static void purchaseCar(){
		System.out.println("Lets buy Maruti");
	}
	
}

class Child extends Parent{
	
	public void purchaseBike(){
		super.purchaseBike();
		System.out.println("Lets purchase Enfield");
	}
	
	static void purchaseCar(){
		Parent.purchaseCar();
		System.out.println("Lets buy Honda");
	}
	
}

public class OverridingDemo {

	public static void main(String[] args) {
		Child chRef = new Child();
		chRef.purchaseBike();
		
		Child.purchaseCar();
	}

}
