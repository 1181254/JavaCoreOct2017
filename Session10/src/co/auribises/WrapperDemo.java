package co.auribises;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int i = 10;
		
		// Explicit
		Integer iRef = new Integer(i); // Boxing | Conversion of pritive into references
		int k = iRef.intValue();       // UnBoxing
		
		int j = 100;
		// Implicit
		Integer jRef = j;		       // AutoBoxing
		int l = jRef; 				   // AutoUnBoxing
		
		
		char ch = 'A';
		Character chRef = new Character(ch);
		
		int c = chRef.charValue();
	}

}
