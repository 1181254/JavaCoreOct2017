
public class Main {

	// main is execution context. execution of program begins here
	public static void main(String[] args) {
		
		int i = 10;
		int[] arr = {10,20,30,40,50};
		
		// uRef is a reference variable
		User uRef1 = new User();
		User uRef2 = new User();
		
		System.out.println("i is: "+i);
		System.out.println("arr is: "+arr);
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		
		// Write the data into Object
		uRef1.name = "John";
		//uRef1.phone = "+91 999988766";
		//uRef1.gender = 'M';
		
		uRef1.setPhone("+91 999988766");
		uRef1.setGender('M');
		
		uRef2.name = "Jennie";
		//uRef2.phone = "+91 567876567";
		//uRef2.gender = 'F';
		uRef2.setPhone("+91 567876567");
		uRef2.setGender('F');
		
		User uRef3 = uRef1; // Reference Copy
		
		uRef3.setGender('N');
		
		// Read from Object
		//System.out.println("uRef1 Details: "+uRef1.name+" - "+uRef1.gender);
		//System.out.println("uRef2 Details: "+uRef2.name+" - "+uRef2.gender);
		System.out.println("uRef1 Details: "+uRef3.name+" - "+uRef1.getGender());
		System.out.println("uRef2 Details: "+uRef2.name+" - "+uRef2.getGender());
		
		Address aRef1 = new Address();
		Address aRef2 = new Address();
		Address aRef3 = new Address();
		
		uRef1.address = aRef1; // Reference Copy
		
		
	}

}
