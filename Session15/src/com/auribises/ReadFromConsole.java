package com.auribises;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		
		/*try {
			
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader buffer = new BufferedReader(reader);
			
			System.out.println("Whats Your Name?");
			String name = buffer.readLine();
			
			System.out.println("Welcome "+name+" Its: "+new Date());
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number a:");
		int a = scanner.nextInt();
		System.out.println("Enter Number b:");
		int b = scanner.nextInt();
		
		int c = a+b;
		System.out.println("sum of "+a+" and "+b+" is "+c);

	}

}
