package com.auribises.threads;

/*class MyTask{
	public void executeTask(){
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("##MyTask## "+i);
		}
	}
}

class A{
	
}

class YourTask extends A implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("@@YourTask@@ "+i);
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {

		System.out.println("Main Started");
		
		//MyTask mRef = new MyTask();
		//mRef.executeTask();
		
		MyTask mRef = new MyTask();
		
		Runnable r = new YourTask(); // RTP
		Thread tRef = new Thread(r);
		
		mRef.setName("Alpha");
		tRef.setName("Charlie");
		Thread.currentThread().setName("Bob");
		
		mRef.setPriority(Thread.MAX_PRIORITY); // 10
		tRef.setPriority(Thread.MIN_PRIORITY); // 1
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // 5
		
		mRef.start();
		
		try {
			mRef.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		tRef.start();
		tRef.yield();
		
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("==Main== "+i);
		}
		
		System.out.println("mRef Name: "+mRef.getName());
		System.out.println("tRef Name: "+tRef.getName());
		System.out.println("main Name: "+Thread.currentThread().getName());
		
		System.out.println("mRef Priority: "+mRef.getPriority());
		System.out.println("tRef Priority: "+tRef.getPriority());
		System.out.println("main Priority: "+Thread.currentThread().getPriority());
		
		System.out.println("Main Finished");
	}

}
