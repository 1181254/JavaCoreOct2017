package com.auribises;

import java.awt.image.BandCombineOp;
import java.io.IOException;

class AccountException extends RuntimeException{
	public AccountException(String message) {
		super(message);
	}
}

class Account{
	
	int balance = 10000;
	int minBalance = 3000;
	
	int attempts = 0;
	
	void withdraw(int amt){ //throws IOException{
		balance = balance - amt;
		if(balance <= minBalance){
			
			attempts++;
			
			/*  // THROWING AN UNCHECKED EXCEPTION
			 	if(attempts>3){
				ArithmeticException ae = new ArithmeticException("Sorry! Your limit is reached");
				throw ae;
			}*/
			
			// THROWING A CHECKED EXCEPTION
			/*if(attempts>3){
				IOException ae = new IOException("Sorry! Your limit is reached");
				throw ae;
			}*/
			
			// THROWING AN UNCHECKED USER DEFINED EXCEPTION
			if(attempts>3){
				AccountException ae = new AccountException("Sorry! Your limit is reached");
				throw ae;
			}
					
			balance = balance+amt;
			System.out.println("Sorry! You cannot withdraw. Your current balance is: \u20b9"+balance);
			
			
			
		}else{
			System.out.println("Withdral for \u20b9"+amt+" successful!! Your current balance is: \u20b9"+balance);
		}
		
	}
	
}

public class ThrowThrows {

	public static void main(String[] args) {
		
		System.out.println("Banking Started...");
		
		Account act = new Account();
		
		for(int i=0;i<500;i++){
			act.withdraw(3000);
			/*try {
				act.withdraw(3000);
			} catch (IOException e) {
				e.printStackTrace();
			}*/
		}
			
		System.out.println("Banking Finished...");

	}

}
