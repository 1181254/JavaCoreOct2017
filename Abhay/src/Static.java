class Student{
	
	// Attributes -> Property of Object
	int roll;
	String name;
	
	// Attributes -> Property of Class
	static String schoolName;
	
	// Methods -> Property of Object
	void showStudent(){ // Object's property can access the property of class
		System.out.println(roll+" belongs to "+name+" in "+schoolName);
	}
	
	// Methods -> Property of Class
	static void showSchool(){ // Class's property cannot access the property of object
		System.out.println("School: "+schoolName);
	}
}

class WhatsApp{
	
	static String groupTitle;
	String status;
	
	void show(){
		System.out.println("status is: "+status+" - Title is: "+groupTitle);
	}
	
}


public class Static {

	public static void main(String[] args) {
		
		WhatsApp.groupTitle = "Auribises";
		
		WhatsApp user1 = new WhatsApp();
		WhatsApp user2 = new WhatsApp();
		WhatsApp user3 = new WhatsApp();
		
		user1.status = "Be Exceptional !!";
		user2.status = "Work Hard..!!";
		user3.status = "Free..!!";
		
		user1.groupTitle = "My Auribises";
		
		user1.show();
		user2.show();
		user3.show();
		
		
		System.out.println("----------");
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.roll = 101;
		s1.name = "John";
		
		s2.roll = 102;
		s2.name = "Jennie";
		
		Student.schoolName = "Convent";
		
		s1.schoolName = "DAV";
		
		s1.showStudent();
		s2.showStudent();
		
		Student.showSchool();
		s1.showSchool();

	}

}
