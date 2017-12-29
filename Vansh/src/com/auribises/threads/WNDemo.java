package com.auribises.threads;

class Message{
	
	String msg;
	
	Message(){
		msg = "No Message Available..";
	}
	
	void writeMessage(){
		msg = "Be Exceptional !!";
		System.out.println("Message Written");
	}
	
	void readMessage(){
		System.out.println("Message is: "+msg);
	}
}

class ReaderThread extends Thread{
	
	Message m;
	
	ReaderThread(Message n){
		m = n;
	}
	
	public void run() {
		synchronized (m) {
			
			try {
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
	
	WriterThread(Message n){
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
		
		ReaderThread rt1 = new ReaderThread(m);
		ReaderThread rt2 = new ReaderThread(m);
		
		WriterThread wt = new WriterThread(m);
		
		rt1.start();
		rt2.start();
		wt.start();
		
	}

}
