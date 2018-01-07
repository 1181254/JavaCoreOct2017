class Parent{
	
	String fname;
	String lname;
	
	Parent(){
		fname = "John";
		lname = "Watson";
		System.out.println("Parent Object Created..");
	}
	
	void show(){
		System.out.println(fname+" - "+lname);
	}
	
}

class Child extends Parent{ // Inheritance
	Child(){
		fname = "Jennie";
		System.out.println("Child Object Created..");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		
		//Parent p1 = new Parent();
		//p1.fname = "George";
		//p1.show();
		
		Child c1 = new Child();
		c1.show();
	}

}
