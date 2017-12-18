class Profile{
	
	// Attributes
	String name;
	char gender;
	int age;
	
	static String color;
	
	Profile(){
		name = "NA";
		gender = 'N';
		age = 0;
		System.out.println("Profile Object Created");
	}
	
	void showProfile(){
		System.out.println(name+ " is "+age+" years old and gender is: "+gender);
	}
	
	static void showColor(){
		System.out.println("Profile is in "+color+" color");
	}
}

class FaceBookProfile extends Profile{
	
	FaceBookProfile(){
		name = "FNA";
		gender = 'U';
		age = -1;
		System.out.println("FacebookProfile Object Created");
	}
}



public class Inheritance {

	public static void main(String[] args) {
		
		//Profile pRef = new Profile();
		//pRef.showProfile();
		
		FaceBookProfile fRef = new FaceBookProfile();
		fRef.showProfile();
		
		FaceBookProfile.color = "Red";
		FaceBookProfile.showColor();

	}

}
