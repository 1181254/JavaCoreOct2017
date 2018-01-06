
public class Strings {

	public static void main(String[] args) {
		
		// Interned Way
		String str1 = "hello World";
		
		// Non Interned Way
		String str2 = new String("Hello World");

		//if(str1 == str2){
		//if(str1.equals(str2)){
		//if(str1.compareTo(str2) == 0){
		if(str1.compareToIgnoreCase(str2) ==0 ){
			System.out.println("Strings are Equal");
		}else{
			System.out.println("Strings are not Equal");
		}
		
		// Strings are IMMUTABLE
		String names = "John, Jennie, Jack, Jim, Joe";
		String[] arr = names.split(",");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].trim());
		}
		
		String s1 = names.substring(5);
		System.out.println(s1);
		
		String s2 = names.substring(0, 5);
		System.out.println(s2);
		
		System.out.println(names.length());
		
		if(names.contains("John")){
			System.out.println("John is in");
		}
		
		String s3 = names.toUpperCase();
		System.out.println("names: "+names);
		System.out.println("s3: "+s3);
		
		char ch = names.charAt(3);
		System.out.println(ch);
		
		String s4 = names.replace("Jo", "Ki");
		System.out.println("s4: "+s4);
		
		if(names.endsWith("Joe")){
			System.out.println("Ends with Joe");
		}
				
	}

}
