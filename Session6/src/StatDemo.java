class Counter{
	
	int count = 0;
	static int scount = 0;
	
	void incrementCount(){
		count++;
		scount++;
	}
	
	void showCount(){
		System.out.println("count is: "+count+" scount is: "+scount);
	}
	
}

public class StatDemo {
	
	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = c1;
		
		
		c1.incrementCount(); //1 1
		c2.incrementCount(); //1 2
		c3.incrementCount(); //2 3
		
		c1.incrementCount(); //3 4 
		c3.incrementCount(); //4 5
		
		c1.incrementCount(); //5 6
		c3.incrementCount(); //6 7
		
		c2.incrementCount(); //2 8

		c1.showCount(); // count ?  scount ?
		c2.showCount(); // count ?  scount ?
		c3.showCount(); // count ?  scount ?
	}

}
