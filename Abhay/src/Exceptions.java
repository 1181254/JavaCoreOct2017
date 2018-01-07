
public class Exceptions {

	public static void main(String[] args) {
		
		System.out.println("App Started...");
		
		int a = 10;
		int b = 0;
		
		try{
			int c = a/b;
			System.out.println("c is: "+c);
		}catch(ArithmeticException ae){
			System.out.println("Exception is: "+ae);
		}
		
		
		int[] arr = {10,20,30,40,50};
		
		try{
			System.out.println(arr[10]);
		}catch(Exception e){
			System.out.println("Some Exception: "+e);
		}
		/*catch(ArrayIndexOutOfBoundsException ai){
			System.out.println("Exception is: "+ai);
		}*/finally{
			System.out.println("100 percent execution");
		}
		
		for(int e : arr){
			System.out.println(e);
		}
		
		System.out.println("App Finished...");

	}

}
