class MyStack{
	
	int[] stack;
	int pos;
	
	// Constructor
	MyStack(){
		stack = new int[10];
		pos = -1;
	}
	
	void pushElement(int elm){
		pos++;
		stack[pos] = elm;
	}
	
	void popElement(){
		stack[pos] = 0;
		pos--;
	}
	
	
	void showStack(){
		for(int n : stack){
			System.out.println("| "+n+" |");
			System.out.println("----------");
		}
	}
}

public class Query {

	public static void main(String[] args) {

		MyStack mRef = new MyStack();
				
		mRef.pushElement(10); // pos = 0
		mRef.pushElement(20); // pos = 1
		mRef.popElement();    // pos = 0
		
		mRef.pushElement(30); // pos = 1
		mRef.pushElement(40); // pos = 2
		mRef.popElement();    // pos = 1
		
		mRef.pushElement(50);
		mRef.pushElement(60);
		mRef.pushElement(70);
		
		mRef.popElement();
		mRef.popElement();
		
		mRef.pushElement(80);
		mRef.popElement();
		mRef.pushElement(90);
		mRef.popElement();
		mRef.pushElement(100);		
		
		mRef.showStack();
	}
}
