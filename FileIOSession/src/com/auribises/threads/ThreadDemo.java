package com.auribises.threads;

/*class MyTask{
	void executeTask(){
		for(int i=1;i<=10;i++){
			System.out.println("##MyTask## "+i);
		}
	}
}*/

class MyTask extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("##MyTask## "+i);
		}
	}
}

class A{
	
}

/*class B extends A,Thread{ // Error -> Multiple Inheritance Not Supported in Java
	public void run(){
		
	}
}*/

class YourTask extends A implements Runnable{ 
	public void run(){
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			System.out.println("@@YourTask@@ "+i);
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Started...");

		MyTask mtRef = new MyTask();
		//mtRef.executeTask();
		
		Runnable r = new YourTask(); // Polymorphic Statement
		Thread th = new Thread(r);
		
		mtRef.start();
		try {
			mtRef.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		th.start();
		
		
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			System.out.println("**Main Thread** "+i);
		}
		
		System.out.println("Main Finished...");
		
	}

}
