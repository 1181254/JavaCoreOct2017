public class App {
	
	public static void main(String[] args) {
		
		int i = 10;
		
		// Object of Student
		Student s1 = new Student();
		Student s2 = new Student();
		
		Student s3 = s1; // reference copy

		System.out.println("i is: "+i);
		System.out.println("s1 is: "+s1);
		
		// Writing the data in Object
		//s1.roll = 101;
		s1.setRoll(101);
		s3.name = "John";
		
		//s2.roll = 102;
		s2.setRoll(102);
		s2.name = "Fionna";
		
		// Reading the data from Object
		
		System.out.println("==========s1===========");
		
		//System.out.println("roll is: "+s1.roll);
		System.out.println("roll is: "+s1.getRoll());
		System.out.println("name is: "+s1.name);
		
		System.out.println("==========s3===========");
		
		//System.out.println("roll is: "+s2.roll);
		System.out.println("roll is: "+s2.getRoll());
		System.out.println("name is: "+s2.name);
		
		System.out.println("==========s3===========");
		
		//System.out.println("roll is: "+s3.roll);
		System.out.println("roll is: "+s3.getRoll());
		System.out.println("name is: "+s3.name);
		
		Student.number = 10;
		
		s1.number = 100;
		s2.number = 10000;
		s3.number = 1000000;
		
		Student.showNumber();
	}

}
