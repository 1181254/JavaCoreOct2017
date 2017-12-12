package com.auribises.threads;

class Table{
	synchronized void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
}

class MyThread extends Thread{
	
	Table t;
	
	MyThread(Table u){
		t = u;
	}
	
	public void run() {
		t.printTable(5);
	}
}

class YourThread extends Thread{
	
	Table t;
	
	YourThread(Table u){
		t = u;
	}
	
	public void run() {
		t.printTable(7);
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		System.out.println("Main Started");
		
		Table t = new Table();
		//t.printTable(5);
		
		MyThread mt = new MyThread(t);
		YourThread yt = new YourThread(t);
		
		mt.start();
		yt.start();
		
		System.out.println("Main Finished");
	}

}
