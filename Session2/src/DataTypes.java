
public class DataTypes {

	public static void main(String[] args) {
		
		// Primitive Data Type
		// Data_Type Var_Name = Literal 
		byte age = 10;
		byte roll = 10;
		
		byte oakAge = 30;
		
		short s = 10;
		
		
		
		int i = 100;
		
		long l = 200000000000L;
		
		short p = (short)i; // Downcasting
		

		float pi = 3.14f;
		double piAgain = 3.14;
		
		float f = (float)piAgain;
		
		char ch = '@';
		char rupee = '\u265e';
		
		System.out.println("ch is: "+ch);
		System.out.println("I have "+rupee+" 500");
		
		boolean flag = true;
		flag = false;
		
		// Reference Data Type
		String str = "This is a great day..";
		
	}

}
