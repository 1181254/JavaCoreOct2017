class One{
	
	private void pvtShow(){
		System.out.println("This is a private show");
	}
	
	void defShow(){
		System.out.println("This is a default show");
	}
	
	protected void protShow(){
		System.out.println("This is a protected show");
	}
	
	public void pubShow(){
		System.out.println("This is a public show");
	}
	
}


public class AccessDemo {

	public static void main(String[] args) {
	
		One o = new One();
		o.defShow();
		o.protShow();
		o.pubShow();
		//o.pvtShow(); error
		

	}

}
