
public class ExcDemo {

	public static void main(String[] args) {
		
		System.out.println("App Started...");
	
		int[] arr = {10,20,30,40,50};
		
		try{
			System.out.println("arr[10] is: "+arr[10]);
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Some Error Occured!!");
			System.out.println("ae is: "+ae);
		}
		
		int a = 10;
		int b = 3;
		int c = a/b;
		System.out.println("c is: "+c);

		System.out.println("App Finished...");
	}

}
