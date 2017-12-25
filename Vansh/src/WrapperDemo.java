
public class WrapperDemo {

	public static void main(String[] args) {
		
		int i = 10; // Primitive Type
		
		// BOXING
		Integer iRef = new Integer(i); // Integer is a Wrapper Class | Primitives can be represented as References
		
		float f = 2.2f;
		Float fRef = new Float(f);
		
		char ch = 'A';
		Character chRef = new Character(ch);
		
		// UN-BOXING
		int j = iRef.intValue();
		float g = fRef.floatValue();
		char dh = chRef.charValue();
		
		System.out.println(j);
		System.out.println(g);
		System.out.println(dh);
		
		System.out.println(iRef);
		System.out.println(iRef.toString());
		
		
		// AUTO BOXING
		Integer kRef = i; // Integer kRef = new Integer(i);
		
		// AUTO UN-BOXING		
		int l = kRef; // int l = kRef.intValue();
	}

}
