// Textually Describe how an Object will be in the memory
class User{
	
	// Attributes
	private String name;
	byte age;
	char gender;
	long phone;
	String address;
	
	//Methods
	// Setter Method - To Write the data
	void setName(String n){
		name = n;
	}
	
	// Getter Method - To Read the data
	String getName(){
		return name;
	}
}


public class ObjectDemo {

	public static void main(String[] args) {
		
		// Object Construction Statement
		User uRef1 = new User();
		// uRef is a Reference Variable
		
		int i = 10;
		
		User uRef2 = new User();
		
		int j = i; // Value Copy
		
		User uRef3 = uRef1; // Reference Copy
		
		System.out.println("i is: "+i);
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		System.out.println("uRef3 is: "+uRef3);
		
		// Write data in Object
		//uRef1.name = "John";
		uRef1.setName("John");
		uRef1.age = 20;
		uRef3.gender = 'M';
		uRef1.phone = 9999999999l;
		uRef1.address = "Redwood Shores";
		
		
		//uRef2.name = "Jennie";
		uRef2.setName("Jennie");
		uRef2.age = 25;
		uRef2.gender = 'F';
		uRef2.phone = 9999998888l;
		uRef2.address = "Country Home North";
		
		// Read data from Object
		//System.out.println(uRef1.name+" is "+uRef1.age+" years old and lives in "+uRef3.address);
		//System.out.println(uRef2.name+" is "+uRef2.age+" years old and lives in "+uRef2.address);
		System.out.println(uRef1.getName()+" is "+uRef1.age+" years old and lives in "+uRef3.address);
		System.out.println(uRef2.getName()+" is "+uRef2.age+" years old and lives in "+uRef2.address);
		
		
		
	}

}
