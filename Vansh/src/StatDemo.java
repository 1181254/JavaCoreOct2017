class Employee{
	
	// Property of Object | non static
	int eid;
	String name;
	
	// Not the property of Object. It is the property of class | static
	static String compName;
	
	Employee(){
		eid = 0;
		name = "NA";
		compName = "NA";
	}
	
	Employee(int e, String n, String c){
		eid = e;
		name = n;
		compName = c;
	}
	
	void showEmployee(){
		System.out.println(name+" employee has an id: "+eid+" and works for "+compName);
	}
	
	static void showCompany(){
		System.out.println("Company: "+compName);
	}
}


public class StatDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"John","Amazon");
		Employee e2 = new Employee(102,"Jennie","Flipkart");
		
		e1.showEmployee();
		e2.showEmployee();
		
		Employee.compName = "Auribises";
		Employee.showCompany();
		
		e1.showEmployee();
		e2.showEmployee();

	}

}
