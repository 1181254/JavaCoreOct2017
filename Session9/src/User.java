public class User {

	// Attributes
	String name;
	int age;
	
	static char gender;
	
	//Methods
	
	User(){
		System.out.println("User Object Created...");
	}
	
	
	void showUser(){
		System.out.println(name+" is "+age+" years old !!");
	}
	
	static void showGender(){
		System.out.println("Gender is: "+gender);
	}
	
}

class FacebookUser extends User{
	
	FacebookUser(){
		System.out.println("FacebookUser Object Created...");
	}
	
	void sayHello(){
		System.out.println("Hello, "+name+" !! Lets explore Facebook..!!");
	}
	
	static void greet(){
		System.out.println("Hello, You are a "+gender+" gender");
	}
	
}
