public class Student {
	
	// Attributes
	private int roll;
	String name;
	int age;
	char gender;
	String address;
	
	static int number;
	
	// Method
	
	// Write | Setter Method
	void setRoll(int r){
		roll = r;
		number = r; // number belongs to class. setRoll belongs to Object.
		// Object's Property can access the property of Class.
	}
	
	// Read | Getter Method
	int getRoll(){
		return roll;
	}
	
	static void showNumber(){
		//roll = 100;// roll belongs to Object. showNumber belongs to Class.
		// Class's Property cannot access the property of Object.
		System.out.println("Number is: "+number);
	}
}

class User{
	
	// Attributes
	String name;
	String email;
	String password;
	
}