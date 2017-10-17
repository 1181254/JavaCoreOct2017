
public class ArrayDemo {

	public static void main(String[] args) {
		
		int i = 10;
		// int j = 10,20; // error
		
		// Primitive Types -> Single Value Container
		
		// Multi Value Container
		// 1. Array | It contains values of same type | Homogeneous
		
		
		// 1.
		int[] arr1 = {10,20,30,40,50}; // Implicit Statement
		
		// i is a variable which holds value
		System.out.println("i is: "+i); 
		
		// arr1 is a reference variable which holds address value
		System.out.println("arr1 is: "+arr1);
		
		int j = i;         // Copy Value
		int[] arr2 = arr1; // Copy Reference
		
		System.out.println("j is: "+j);
		System.out.println("arr2 is: "+arr2);
		
		//2. 
		int[] arr3 = new int[]{10,20,30,40,50,60,70,80,90,100}; // Explicit Statement

		//3. 
		int arr4[] = {10,20,30,40,50}; // Implicit Statement
		int arr5[] = new int[]{10,20,30,40,50,60,70,80,90,100}; // Explicit Statement
		
		//4. 
		int arr6[];
		arr6 = new int[10]; // All the elements in array will have value 0
		
		int arr7[] = new int[5];
		
		int a1[],a2[],a3;
		// a3 is a normal integer
		a3 = 10;
		a1 = new int[2];
		a2 = new int[5];
		
		int[] a4,a5,a6;
		a4 = new int[2];
		a5 = new int[5];
		a6 = new int[2];
		

		// Read and Write Operations in Array
		
		//1. Write One/Selective
		arr6[1] = 100;
		
		//2. Write All
		for(int idx=0;idx<arr6.length;idx++){
			arr6[idx] = idx*2;
		}
		
		//1. Read One/Selective
		System.out.println(arr5[0]);
		System.out.println(arr5[9]);
		
		
		System.out.println("--------");
		
		//2. Read All
		for(int idx=0;idx<arr5.length;idx++){
			System.out.print(arr5[idx]+"  ");
		}
		
		System.out.println();
		
		//3. Read All - Enhanced for loop 
		for(int elm : arr6){
			System.out.print(elm+"  ");
		}
		
		System.out.println();
		
		System.out.println("This is "+" an awesome day and i is: "+i);
		
		
		int[] ar1 = {10,20,30,40,50};
		// Copy Operation
		int[] ar2 = new int[ar1.length];
		
		int[] ar3 = ar1; // Reference Copy
		
		for(i=0;i<ar1.length;i++){
			ar2[i] = ar1[i];
		}
		
		for(int num : ar2){
			System.out.print(num+"  ");
		}
		
		System.out.println();
		
		ar1[2] = 1000;
		
		System.out.println("ar1[2] is: "+ar1[2]);
		System.out.println("ar3[2] is: "+ar3[2]);
		
		System.out.println("ar1 before resizing: "+ar1);

		int[] temp = new int[ar1.length];
		System.arraycopy(ar1, 0, temp, 0, ar1.length);
		
		ar1 = new int[10]; // Arrays are not Resized
		// A new Array is created
		
		System.arraycopy(temp, 0, ar1, 0, temp.length);
		
		
		System.out.println("ar1 after resizing: "+ar1);
		
		for(int num : ar1){
			System.out.print(num+"  ");
		}
	}

}
