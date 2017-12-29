package com.auribises.threads;

class CA{
	int a,b;
	//..
	
	CA(){
		System.out.println("Object Created");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Destroyed");
	}
}

class MyThread extends Thread{

	public void run() {
		System.out.println("Thread Executed...");
	}
	
}

public class RTDemo {

	public static void main(String[] args) {
		System.out.println("Main Started");

		CA ca1 = new CA();
		CA ca2 = new CA();
		CA ca3 = new CA();
		
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("Total Memory: "+rt.totalMemory());
		System.out.println("Free Memory: "+rt.freeMemory());
		System.out.println("Max Memory: "+rt.maxMemory());
		
		ca1 = null;
		ca2 = null;
		ca3 = null;
		
		//rt.gc();
		System.gc();
		
		MyThread mRef = new MyThread();
		
		rt.addShutdownHook(mRef);
		
		System.out.println("Total Memory: "+rt.totalMemory());
		System.out.println("Free Memory: "+rt.freeMemory());
		System.out.println("Max Memory: "+rt.maxMemory());
		
		
		System.out.println("Main Finished");
	}

}
