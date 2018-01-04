import java.util.Date;

public class MyFirstProgram {

	// Entry to the program| Shall be executed firstly
	public static void main(String[] args) {
		
		int age = 10;
		char ch = 'M';
		boolean flag = true;
		float f = 2.2f;
		double d = 30.3;
		long l = 200000000l;
		
		String name = "John Watson";
		
		System.out.println(age);
		System.out.println(ch);
		System.out.println(flag);
		System.out.println(d);
		System.out.println(l);
		
		int a = 10;
		int b = 20;
		int c = a+b;
		int d1 = (a*a)+(b*b)+(2*a*b);
		
		System.out.println("a is: "+a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d1);

		System.out.println("Hello, "+name);
		System.out.println("Today is: "+new Date());
	}

}
