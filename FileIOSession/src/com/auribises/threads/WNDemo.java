package com.auribises.threads;

class Message{
	
	String msg;
	
	Message(){
		msg = "No Message Available!!"; 
	}
	
	void writeMessage(){
		msg = "Search the Candle, rather than cursing the darkness!!";
		System.out.println("Message Written!!");
	}
	
	void readMessage(){
		System.out.println("Message is : "+msg);
	}
}

class ReaderThread extends Thread{
		
	Message m;
	
	ReaderThread(Message n) {
		m = n;
	}
	
	public void run() {
		synchronized (m) {
			
			try {
				System.out.println("Thread: "+Thread.currentThread().getName());
				m.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			m.readMessage();
		}
	}
	
}

class WriterThread extends Thread{
	
	Message m;
	
	WriterThread(Message n) {
		m = n;
	}
	
	public void run() {
		synchronized (m) {
			m.writeMessage();
			//m.notify();
			m.notifyAll();
		}
	}
	
}

public class WNDemo {

	public static void main(String[] args) {
		
		Message m = new Message();
		
		ReaderThread r1 = new ReaderThread(m);
		ReaderThread r2 = new ReaderThread(m);
		WriterThread w1 = new WriterThread(m);
		
		r1.start();
		r2.start();
		w1.start();

	}

}
