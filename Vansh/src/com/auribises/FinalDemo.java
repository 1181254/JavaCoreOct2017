package com.auribises;

final class CA{
	final void show(){
		
	}
}

class CB{ //extends CA{
	/*void show(){
		
	}*/
}

interface Inf{
	int a=10; // public static final int a = 10;
}

public class FinalDemo {

	public static void main(String[] args) {
		
		int a = 10;
		a = 100;
		
		final int b = 10;
		//b = 200; error
		
		System.out.println(Inf.a);
	}

}
