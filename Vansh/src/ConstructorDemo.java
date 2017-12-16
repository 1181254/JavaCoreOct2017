class Driver{
	
	String name;
	String cabName;
	int exp;
	int salary;
	String email;
	
	Driver(){
		name = "NA";
		exp = 3;
	}
}


public class ConstructorDemo {

	public static void main(String[] args) {
		
		Driver dRef1 = new Driver();
		System.out.println(dRef1.name);
		System.out.println(dRef1.exp);

	}

}
