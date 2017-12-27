package com.auribises;

import java.io.IOException;


// UNCHECKED
class BankingException extends RuntimeException{
	BankingException(String message) {
		super(message);
	}
}

// CHECKED
class MyBankingException extends Exception{
	MyBankingException(String message) {
		super(message);
	}
}

class BankAccount{
	
	int balance = 10000;
	int minBal = 3000;
	
	int attempts = 0;
	
	void withdraw(int amt){
		
		balance = balance - amt;
		
		if(balance<=3000){
			balance = balance + amt;
			System.out.println("Withdrawl Failure!! Low Balance !! Balance is: \u20b9"+balance);
			
			attempts++;
			
			if(attempts == 3){
				//ArithmeticException ae = new ArithmeticException();
				//throw ae;
				
				BankingException be = new BankingException("LOW Balance !!");
				throw be;
			}
			
		}else{
			System.out.println("Withdrawl Success!! Balance is: \u20b9"+balance);
		}
	}
	
	void withdrawAgain(int amt) throws IOException{
		
		balance = balance - amt;
		
		if(balance<=3000){
			balance = balance + amt;
			System.out.println("Withdrawl Failure!! Low Balance !! Balance is: \u20b9"+balance);
			
			attempts++;
			
			if(attempts == 3){
				IOException io = new IOException();
				throw io;
			}
			
		}else{
			System.out.println("Withdrawl Success!! Balance is: \u20b9"+balance);
		}
	}
}

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		
		System.out.println("Banking Started..");
		
		BankAccount bRef = new BankAccount();
		
		for(int i=1;i<=100;i++)
			bRef.withdraw(3000);
		
		/*for(int i=1;i<=100;i++)
			try {
				bRef.withdrawAgain(3000);
			} catch (IOException e) {
				e.printStackTrace();
			}*/

		System.out.println("Banking Finished..");
	}

}
