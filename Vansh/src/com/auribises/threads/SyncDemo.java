package com.auribises.threads;

class Table{
	//synchronized void printTable(int num){
	void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
	
	void fun(){
		
	}
}

class ThreadOne extends Thread{
	
	Table t;
	
	ThreadOne(Table s){
		t = s;
		System.out.println(t);
	}
	
	public void run() {
		synchronized (t) {
			t.printTable(5);
		}
	}
}

class ThreadTwo extends Thread{
	
	Table t;
	
	ThreadTwo(Table s){
		t = s;
		System.out.println(t);
	}
	
	public void run() {
		synchronized (t) {
			t.printTable(7);
			t.fun();
		}
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		System.out.println("Main Started...");
		
		Table t = new Table();
		System.out.println(t);
		//t.printTable(5);
		
		ThreadOne tOne = new ThreadOne(t);
		ThreadTwo tTwo = new ThreadTwo(t);
		
		tOne.start();
		tTwo.start();
		
		System.out.println("Main Finished...");
	}

}
