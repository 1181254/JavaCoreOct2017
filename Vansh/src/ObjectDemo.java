class AA{ // extends Object{
	
	public String toString() {
		return "This is Awesome";
	}
	
}

class BB extends AA{
	
}

public class ObjectDemo {

	public static void main(String[] args) {
	
		AA ref = new AA();
		System.out.println("ref is: "+ref);
		System.out.println("ref is: "+ref.toString());
		
		System.out.println("hashcode of ref is: "+ref.hashCode());
		
		System.out.println("ref class is: "+ref.getClass());
		System.out.println("ref class is: "+ref.getClass().getSimpleName());
		
		Object oRef;
		oRef = new AA();
		oRef = new BB();
		oRef = new String();
		oRef = new Object();
		
	}
	
}
