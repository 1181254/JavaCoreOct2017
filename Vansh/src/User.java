// Their exists and object called User
public class User {

	// In the User we have attributes/state/data members/fields/property
	String name;
	private String phone;
	String email;
	String password;
	int age;
	private char gender;
	String address;
	
	
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
