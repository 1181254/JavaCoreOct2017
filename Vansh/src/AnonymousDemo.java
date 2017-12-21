interface Inf{
	void show();
}

/*class AnDemo implements Inf{
	public void show(){
		System.out.println("This is Show");
	}
}*/

public class AnonymousDemo {

	public static void main(String[] args) {
		//AnDemo aRef = new AnDemo();
		//aRef.show();
		
		// Anonymoys Class in Java
		Inf iRef = new Inf(){
			public void show(){
				System.out.println("This is Show");
			}
		};
		
		iRef.show();

	}

}
