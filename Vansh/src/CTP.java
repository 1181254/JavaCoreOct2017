class Calculator{
	
	Calculator() {
	
	}
	
	Calculator(int a) {
		
	}
	
	int addNums(int a, int b){
		return a+b;
	}
	
	int addNums(int a, int b, int c){
		return a+b+c;
	}
	
	// Overloading
	// 1. It happens only in an Object or Class
	// 2. Function Name is Same
	// 3. Inputs are different
		//3.1 Number of Inputs
		//3.2 Type of Inputs
		//3.3 Sequence of Inputs
	// 4. Ack or Return Type has no role
	
	
	
	void fun(){
		
	}
	
	int fun(int a){
		return 0;
	}
	
	void fun(int a, int b){
		
	}
	
	void fun(float a, float b){
		
	}
	
	void fun(int a, float b){
		
	}
	void fun(float a, int b){
		
	}
	
	static void hello(){
		
	}
	
	static void hello(int z){
		
	}
}


public class CTP {

	public static void main(String[] args) {
		
		Calculator cRef = new Calculator();
		System.out.println(cRef.addNums(10, 20));
		System.out.println(cRef.addNums(10, 20, 30));
		cRef.fun();
		cRef.fun(10);
		cRef.fun(10,20);
		cRef.fun(2.2F,3.3F);
		cRef.fun(2,3.3F);
		cRef.fun(2.2F,3);

	}

}
