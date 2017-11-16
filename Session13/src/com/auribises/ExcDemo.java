package com.auribises;

public class ExcDemo {

	public static void main(String[] args) {
		System.out.println("App Started...");
		
		int[] arr = {10,20,30,40,50};
		
		int iVar = 10;
		int j = 0;
		int k = 0;
		
		try{
			
			
			try {
				System.out.println("arr[30] is: "+arr[30]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Some Error");
				System.out.println("Some Error: "+e.getMessage());
				System.out.println("Some Error: "+e);
				e.printStackTrace();
			}
			
			k = iVar/j;
			System.out.println("k is: "+k);
			
			
			
		}catch(Exception e){
			System.out.println("OOPS! Something went Wrong.. AIOBE");
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			System.out.println("OOPS! Something went Wrong.. AIOBE");
		}catch(ArithmeticException aRef){
			System.out.println("OOPS! Something went Wrong.. AE");
		}*/finally {
			System.out.println("This is important");
		}

		for(int i=1;i<=10;i++){
			System.out.println("i is: "+i);
		}
		
		System.out.println("App Finished...");
	}

}
