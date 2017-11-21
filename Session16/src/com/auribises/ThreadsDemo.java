package com.auribises;

/*class Task{
	void executeTask(){
		for(int i=1;i<=100;i++){
			System.out.println("**Task**"+i);
		}
	}
}*/

class Task extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("**Task**"+i);
		}
	}
}

class YourTask implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("##YourTask##"+i);
		}
	}
}

class A{
	
}

class B extends A implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("##YourTask##"+i);
		}
	}
}

public class ThreadsDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Thread Started...");
		
		//Task t = new Task();
		//t.executeTask();
		
		Task t = new Task();
		
		Runnable r = new YourTask(); // Polymorphic Statement
		Thread th = new Thread(r);
		
		t.setName("Charlie");
		th.setName("Rocky");
		
		t.setPriority(Thread.MIN_PRIORITY);
		th.setPriority(Thread.NORM_PRIORITY);
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		Thread.currentThread().setName("MyMain");
		
		th.start();
		
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t.start();
		
		t.yield();
		
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("@@Main Thread@@"+i);
		}
		
		System.out.println("t name: "+t.getName());
		System.out.println("th name: "+th.getName());
		System.out.println("main name: "+Thread.currentThread().getName());
		
		System.out.println("t priority: "+t.getPriority());
		System.out.println("th priority: "+th.getPriority());
		System.out.println("main priority: "+Thread.currentThread().getPriority());
		
		System.out.println("Main Thread Finished...");

	}

}
