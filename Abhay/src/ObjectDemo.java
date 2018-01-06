import java.util.Scanner;

class User{ // Textual Representation of an Object
	
	// Attributes or State or Data Members of an Object
	String name;
	String email;
	long phone;
	private int age;
	char gender;
	String address;
	
	// Method or Behavior or Member Function of an Object
	void setAge(int a){
		age = a;
	}
	
	int getAge(){
		return age;
	}
	
	void showUser(){
		System.out.println(name+" is "+age+" years old. Having a gender: "+gender+"\nLives in "+address);
	}
}


public class ObjectDemo {
	public static void main(String[] args) {

		int i = 10;
		int[] j = {10,20,30,40,50};
		User u1 = new User();
		User u2 = new User();

		// i is a normal variable, holds value
		// j and u are reference variables, holds address
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(u1);
		System.out.println(u2);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name of User1");
		u1.name = scanner.nextLine();
		
		System.out.println("Enter Age of User1");
		int a = scanner.nextInt();
		
		scanner.close(); // to release the memory
		
		// Write data in object
		//u1.name = "John";
		u1.phone = 9876543212l;
		u1.gender = 'M';
		//u1.age = 20;
		//u1.setAge(20); // Calling the method of an Object
		u1.setAge(a);
		u1.address = "Redwood Shores";
		u1.email = "john@example.com";
		
		
		u2.name = "Jennie";
		u2.phone = 5674567809l;
		u2.gender = 'F';
		//u2.age = 18;
		u2.setAge(18);
		u2.address = "Southern Shores";
		u2.email = "jennie@example.com";
		
		// Read data from Object
		//System.out.println(u1.name +" is "+u1.age+" years old");
		//System.out.println(u2.name +" is "+u2.age+" years old");
		
		//System.out.println(u1.name +" is "+u1.getAge()+" years old");
		//System.out.println(u2.name +" is "+u2.getAge()+" years old");
		
		u1.showUser();
		u2.showUser();
	}
}
