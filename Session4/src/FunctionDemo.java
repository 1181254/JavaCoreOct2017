
public class FunctionDemo {

	// Function or Method or Procedure or Routine
	// Ack Name(Inputs){
	//  ....
	// }
	
	void calculateArea1(int length, int breadth){
		int area = length*breadth;
		System.out.println("Area of Rectangle is "+area+" mtr square");
	}
	
	int calculateArea2(int length, int breadth){
		int area = length*breadth;
		return area;
	}
	
	static void calculateArea3(int length, int breadth){
		int area = length*breadth;
		System.out.println("Area of Rectangle is "+area+" mtr square");
	}
	
	static int calculateArea4(int length, int breadth){
		int area = length*breadth;
		return area;
	}
	
	void printArray(int []arr){
		for(int num : arr){
			System.out.print(num+"  ");
		}
	}
	
	static void printIntArray(int []arr){
		for(int num : arr){
			System.out.print(num+"  ");
		}
	}
	
	int getMaxNum(int[][] arr){
		
		return 0;
	}
	
	
	
	public static void main(String[] args) {

		/*calculateArea3(10, 20);
		calculateArea3(11, 21);
		FunctionDemo.calculateArea3(12, 22);*/
		
		/*int a = calculateArea4(10, 20);
		System.out.println("area is: "+a);
		
		a = calculateArea4(11, 21);
		System.out.println("area is: "+a);
		
		a = FunctionDemo.calculateArea4(12, 22);
		System.out.println("area is: "+a);*/
		
		// Object Creation Instruction
		FunctionDemo fRef = new FunctionDemo();
		//fRef.calculateArea1(10, 20);
		//int a = fRef.calculateArea2(10, 20);
		//System.out.println("a is: "+a);
		
		int[] a1 = {1,2,3,4,5};
		int[] a2 = {10,20,30,40,50,60,70,80,90,100};
		
		printIntArray(a1);
		
		System.out.println();
		
		printIntArray(a2);
		
	}

}
