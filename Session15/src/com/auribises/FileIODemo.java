package com.auribises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

class FileIOOperations{
	
	File file;
	FileInputStream fis; // To read a file in bytes
	FileOutputStream fos; //To write in file in bytes
	
	FileReader reader;
	BufferedReader buffer;
	
	FileWriter writer;
	
	void readFromFile(){
		
		try {
			
			file = new File("/Users/ishantkumar/Downloads/myfile.php");
			if(file.exists()){
				
				fis = new FileInputStream(file);
				
				int ch = 0;
				int count = 0;
				
				while((ch = fis.read()) != -1){
					
					char c = (char)ch;
					
					if(c=='a')
						count++;
					
					System.out.print(c);
				}
				
				System.out.println("a occurs: "+count+" number of times");
			}
			
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	void readFromFileAgain(){
		try {
			
			file = new File("/Users/ishantkumar/Downloads/myfile.php");
			if(file.exists()){
				
				reader = new FileReader(file);
				buffer = new BufferedReader(reader);
				
				String line = "";
				int count = 0;
				while((line = buffer.readLine()) != null){
					
					System.out.println(line);
					if(line.contains("</div>"))
						count++;
				}
				
				System.out.println("<div> tag occurs "+count+" number of times");
			}
			
			buffer.close();
			reader.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void writeInFile(){
		try {
			file = new File("/Users/ishantkumar/Downloads/myfile.java");
			fos = new FileOutputStream(file,true); // true means append mode
			
			String data = "class Hello{ void fun(){} }";
			
			fos.write(data.getBytes());
				
			fos.close();
			
			System.out.println("Data Written..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void writeInFileAgain(){
		try {
			file = new File("/Users/ishantkumar/Downloads/YourFile.java");
			writer = new FileWriter(file,true);
			
			String data = "class GoodLuck{ void fun(){} }";
			
			writer.write(data);
				
			writer.close();
			
			System.out.println("Data Written..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class FileIODemo {
	public static void main(String[] args) {	
		FileIOOperations fo = new FileIOOperations();
		//fo.readFromFile();
		//fo.writeInFile();
		//fo.readFromFileAgain();
		fo.writeInFileAgain();
	}
}
