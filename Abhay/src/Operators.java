
public class Operators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		int c = a % b;
		System.out.println("c is: "+c);
		
		//a = a+10;
		a += 10;
		System.out.println("a is: "+a);
		
		
		//b = b % 2;
		b %= 2;
		System.out.println("b now is: "+b);
		
		
		// Arithmetic Operations + - * / %
		// Assignment Operations = += -= *= /=  %=
		
		// if/else
		// Relational Operator > < >= <= == !=
		// Logical Operators && || !
		
		// Bitwise & | ^
		int n1 = 8;  		 // 1 0 0 0 
		int n2 = 10;			 // 1 0 1 0 
		
		int n3 = n1 & n2;	 // 1 0 0 0
		System.out.println("n3 is: "+n3);
		
		int n4 = n1 | n2;    // 1 0 1 0
		System.out.println("n4 is: "+n4);
		
		// Shift Operators
		int n5 = 8;          // 1 0 0 0
		int n6 = n5>>3;		 // 0 0 1 0 // 2
		
		// divide by 2pow3
		
		System.out.println("n6 is: "+n6);
		
		int n7 = n5<<3;		//1 0 0 0 0 0
		// multiple by 2pow3
		System.out.println("n7 is: "+n7);
		

	}

}
