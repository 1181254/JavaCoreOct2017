package com.auribises;

public class ExcDemo {

	public static void main(String[] args) {
		
		System.out.println("App Started...");
		

		int[] arr = {10,20,30,40,50};
		int a=10,b=0,c=0;
		
		try {
			System.out.println(arr[10]);
			
			c = a/b;
			System.out.println("c is: "+c);
			
			
			
		}catch(Exception e){
			System.out.println("Some Exception: "+e); // Release
		} /*catch (ArrayIndexOutOfBoundsException e) { // RTP
			System.out.println("Some Exception: "+e); // Release
			//e.printStackTrace(); // Debug
		} catch (ArithmeticException e) { // RTP
			System.out.println("Some Exception: "+e); // Release
			//e.printStackTrace(); // Debug
		}*/finally{
			System.out.println("Important Statement");
		}
		
		
	
		
		
		System.out.println("App Finished...");
	}

}
