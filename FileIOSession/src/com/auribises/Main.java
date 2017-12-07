package com.auribises;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main Started...");
		
		FileDemo fRef = new FileDemo();
		//fRef.files();
		//fRef.readFromFile();
		//fRef.readFromFileAgain();
		fRef.writeInFile();
		
		System.out.println("Main Finished...");
	}

}
