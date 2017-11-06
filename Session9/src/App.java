
class Student{
	
	// Constructor
	Student(){
		System.out.println("Student Created...");
	}
	
}

public class App {

	public static void main(String[] args) {
		
		//Student sRef = new Student();
		
		/*User uRef = new User();
		int i = 10;
		
		System.out.println("i is: "+i);
		System.out.println("uRef is: "+uRef);
		
		uRef.name = "John Watson";
		uRef.age = 30;
		
		uRef.showUser();*/
		
		
		FacebookUser fbRef = new FacebookUser();
		fbRef.name = "Fionna";
		fbRef.age = 27;
		
		fbRef.showUser();
		

		FacebookUser.gender = 'F';
		FacebookUser.greet();
		
	}

}
