package com.auribises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileDemo {
	
	void writeInFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads","1352Quotes.txt");

			//FileOutputStream fos = new FileOutputStream(file);
			FileOutputStream fos = new FileOutputStream(file,true); // append mode
			
			String quote1 = "Be Exceptional!!";
			String quote2 = "Search the candle, rather than cursing the darkness!!";
			
			fos.write(quote2.getBytes());

			//fos.flush();
			
			fos.close();
			
			System.out.println("File Written");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	
	void writeInFileAgain(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads","1352Quotes.txt");

			//FileOutputStream fos = new FileOutputStream(file);
			FileWriter writer = new FileWriter(file,true); // append mode
			
			String quote1 = "Be Exceptional!!";
			String quote2 = "Search the candle, rather than cursing the darkness!!";
			
			writer.write(quote2);

			//fos.flush();
			
			writer.close();
			
			System.out.println("File Written");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	
	void readFromFile(){
		
		try {
		
			File file = new File("/Users/ishantkumar/Downloads","MyMain.java");

			FileInputStream fis = new FileInputStream(file);
			
			int ch = 0;
			
			while((ch = fis.read()) != -1){
				System.out.print((char)ch);
			}
			
			fis.close();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	void readFromFileAgain(){
		
		try {
		
			File file = new File("/Users/ishantkumar/Downloads","MyMain.java");

			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader); // IO Chaining
			
			
			String line = "";
			while((line = buffer.readLine())!=null){
				System.out.println(line);
			}
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}

	void files(){
		
		try {
		
			File file = new File("/Users/ishantkumar/Downloads");
			//File file = new File("/Users/ishantkumar/Downloads/Main.java");
			//File file = new File("/Users/ishantkumar/Downloads","Main.java");
			//File file1 = new File("/Users/ishantkumar/Downloads","MyMain.java");
			
			if(file.exists()){
				
				if(file.isDirectory()){
					System.out.println("Directory Exists: "+file.getName());
					
					String[] names = file.list();
					for(String str : names){
						if(str.endsWith(".jpg"))
							System.out.println(str);
					}
					
					File[] files = file.listFiles();
					
					for(File f : files){
						if(f.isDirectory())
							System.out.println(f);
					}
					
				}else{
					System.out.println("File Exists: "+file.getName());
					//file.renameTo(file1);
					//System.out.println("File Renamed");
				}
				
				//file.delete();
				
			}else{
				System.out.println("No Such File: "+file.getName());
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
}
