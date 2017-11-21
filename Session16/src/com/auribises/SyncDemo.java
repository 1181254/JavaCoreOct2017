package com.auribises;

class Table{
	//void printTable(int num){
	//synchronized void printTable(int num){
	void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
}

class MyThread extends Thread{
	
	Table t;
	
	MyThread(Table s){
		t = s;
	}
	
	public void run() {
		
		synchronized (t) {
			t.printTable(5);
		}
		
	}
	
}

class YourThread extends Thread{
	
	Table t;
	
	YourThread(Table s){
		t = s;
	}
	
	public void run() {
		synchronized (t) {
			t.printTable(7);
		}
	}
	
}

public class SyncDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Started...");
		
		Table tRef = new Table();
		//tRef.printTable(5);
		
		MyThread mRef = new MyThread(tRef);
		YourThread yRef = new YourThread(tRef);
		
		mRef.start();
		yRef.start();
		
		System.out.println("Main Finished...");
	}

}
