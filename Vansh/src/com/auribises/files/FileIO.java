package com.auribises.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIO {

	void readFromFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads","FileIO.java"); 
			if(file.exists()){
				
//				FileInputStream fis = new FileInputStream(file);
//				int ch = 0;
//				
//				while((ch = fis.read()) != -1){
//					System.out.print((char)ch);
//				}
//				
//				fis.close();
				
				FileReader reader = new FileReader(file);
				BufferedReader buffer = new BufferedReader(reader);
				String line = "";
				while((line = buffer.readLine()) != null){
					System.out.println(line);
				}
				
				buffer.close();
				reader.close();
			}else{
				System.out.println("No Such File: "+file.getName());
			}
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
			e.printStackTrace();
		}
	}
	
	void writeIntoFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads","students.txt");
			
//			FileOutputStream fos = new FileOutputStream(file,true);
//			String data = "Be Exceptional!!";
//			String data1 = "Work Hard, Get Luckier..!!";
//			
//			//if(!file.exists())
//			//	file.createNewFile();
//			
//			fos.write(data.getBytes());
			//fos.close();
			
			FileWriter writer = new FileWriter(file,true);
			String data = "Be Exceptional!!";
			String data1 = "Work Hard, Get Luckier..!!";
			
			writer.write(data);
			writer.write(data1);
			
			writer.close();
			
			System.out.println("File Contents Written");
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
//		char ch = 'A';
//		int i = ch;
//		System.out.println("i is: "+i);
//		i++;
//		System.out.println("i is: "+(char)i);
		
		FileIO fRef = new FileIO();
		//fRef.readFromFile();
		fRef.writeIntoFile();

	}

}
