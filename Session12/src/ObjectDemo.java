
class Employee{ //extends Object{
	
	void sayHello(String name){
		System.out.println("Hello, "+name);
	}
	
	public String toString(){
		String str = "Be Exceptional !!";
		return str;
	}
}

class Manager extends Employee{
	
}

class P{
	
}

class Z{
	
}

public class ObjectDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		Employee e3 = e1;
		
		System.out.println("e1 is: "+e1.toString());
		System.out.println("e2 is: "+e2.toString());
		
		System.out.println("e1 hashcode: "+e1.hashCode());
		System.out.println("e2 hashcode: "+e2.hashCode());
		System.out.println("e3 hashcode: "+e3.hashCode());
		
		System.out.println("e1 class is: "+e1.getClass()); // class com.auribises.Employee
		System.out.println("e1 class is: "+e1.getClass().getSimpleName()); // Employee
		System.out.println("e1 class is: "+e1.getClass().getName()); // com.auribises.Employee
		
		/*Object o;
		o = new Employee();
		o = new Manager();
		o = new P();
		o = new Z();*/
		
		String str = new String("Hello");
		System.out.println("str is: "+str.toString());

	}

}
