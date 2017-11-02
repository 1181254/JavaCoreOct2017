
public class StringDemo {

	public static void main(String[] args) {
		
		// Interned Way
		String str1 = "Hello World";
		String str2 = "Hello World";
		
		// Non Intenrned Way or Object Creation
		String str3 = new String("Hello World");
		String str4 = new String("Hello World");

		int i = 10;
		int j = 10;
		
		if(str1 == str2){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		
		if(str1 == str3){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		
		//if(str3 == str4){
		//if(str3.equals(str4)){
		if(str3.equalsIgnoreCase(str4)){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		
		// Stings are IMMUTABLE
		String str5 = "John, Jennie, Jack, Jim, Joe";
		System.out.println("str5 is: "+str5);
		String str6 = str5.toUpperCase();
		System.out.println("str5 now is: "+str5);
		System.out.println("str6 is: "+str6);
		
		String[] strArr = str5.split(",");
		for(String s : strArr){
			System.out.println(s.trim());
		}
		
		if(str5.contains("Jennie")){
			System.out.println("Jennie is in the String");
		}
		
		// IMMUTABLE
		String str = new String("Be Exceptional!!");
		str.concat(" Wow!!");
		System.out.println(str);
		
		// MUTABLE
		StringBuffer buffer =  new StringBuffer("Be Exceptional");
		StringBuilder builder =  new StringBuilder("Be Exceptional");
		buffer.append(" Wow!");
		System.out.println(buffer);
	}

}
