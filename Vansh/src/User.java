// Their exists and object called User
public class User {

	// In the User we have attributes/state/data members/fields/property
	String name;
	private String phone;
	String email;
	String password;
	int age;
	private char gender;
	//String address;
	Address address; // Reference Variable | HAS-A Relation
	
	
	// Methods
	
	// Setters and Getters
	void setPhone(String p){
		phone = p;
	}
	
	String getPhone(){
		return phone;
	}
	
	void setGender(char g){
		gender = g;
	}
	
	char getGender(){
		return gender;
	}
	
}

class Address{
	String adrsLine1;
	String adrsLine2;
	String city;
	String state;
	int zipCode;
	String country;
}

// Containment or Nesting
class A{
	int a;
	
	void fun(){
		System.out.println("a is: "+a);
	}
	
	class B{
		int b;
		
		void fun(){
			System.out.println("a is: "+a);
			System.out.println("b is: "+b);
		}
	}
}
