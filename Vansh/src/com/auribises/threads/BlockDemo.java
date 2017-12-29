package com.auribises.threads;

public class BlockDemo {

	BlockDemo(){
		System.out.println("This is BlockDemo");
	}
	
	// Initializer Block
	{
		System.out.println("This is Block1");
	}
	
	{
		System.out.println("This is Block2");
	}
	
	// Static Initializer Block
	static{
		System.out.println("This is static Block");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Started..");
		BlockDemo b1 = new BlockDemo();
		BlockDemo b2 = new BlockDemo();
		System.out.println("Main Finsihed..");
	}

}
