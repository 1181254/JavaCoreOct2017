
public class StringDemo {

	public static void main(String[] args) {
		
		// Interned Way
		String str1 = "Hello";
		String str2 = "Hello";
		
		// Non-Interned Way
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		if(str3.equals(str4)){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		if(str1.equals(str4)){
			System.out.println("str1 == str4");
		}else{
			System.out.println("str1 != str4");
		}
		
		System.out.println("str1 is: "+str1);
		System.out.println("str4 is: "+str4);
		
		// Strings are IMMUTABLE
		// 1001
		String str5 = "This is Awesome";
		
		//2001
		String str6 = str5.toUpperCase();
	
		
		System.out.println("str5 is: "+str5);
		System.out.println("str6 is: "+str6);
		
		System.out.println(str5.substring(3));
		System.out.println(str5.substring(3,8));
		
		char[] chArr = str5.toCharArray();
		for(char ch : chArr){
			System.out.print(ch+" ");
		}
		
		System.out.println();
		
		System.out.println(str5.length());
		
		System.out.println(str5.charAt(0));
		
		String str = "John, Jennie, Jack, Jim, Joe";
		
		String[] strArr = str.split(",");
		for(String s : strArr){
			System.out.println(s.trim());
		}
		
		if(str.contains("John")){
			System.out.println("John is in the list");
		}
		
		if(str.endsWith("oe")){
			System.out.println("oe is in the list");
		}
		
		String str7 = str.replace('J', 'K');
		System.out.println(str7);
		
		String string = new String("Hello World");
		
		// MUTABLE
		StringBuilder builder = new StringBuilder("Hello World"); // Not Thread-Safe
		StringBuffer buffer = new StringBuffer("Hello World"); // Thread-Safe
		
		string.concat(" Bye World");
		builder.append(" Bye World");
		buffer.append(" Bye World");
		
		System.out.println(string);
		System.out.println(builder);
		System.out.println(buffer);
		
		Object o = new String();
		o = new StringBuffer();
		o = new StringBuilder();
		
		CharSequence cs = new String();
		cs = new StringBuffer();
		cs = new StringBuilder();
		
		
	}

}
