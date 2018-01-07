class Father{
	void purcahseBike(){
		System.out.println("Lets Purchase Pulsar...");
	}
}

class Son extends Father{
	void purcahseBike(){
		//super.purcahseBike(); // to access parent's data
		System.out.println("Lets Purchase Enfield...");
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		Son s = new Son();
		s.purcahseBike();

	}

}
