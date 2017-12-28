package com.auribises.files;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/myfile.txt");
			//File file = new File("/Users/ishantkumar/Downloads","yourfile.txt");
			//File file1 = new File("/Users/ishantkumar/Downloads","yourfile.txt");
			//File file = new File("/Users/ishantkumar/Downloads");
			File file = new File("/Users/ishantkumar/Downloads/myDir");
			if(file.exists()){
				
				if(file.isFile()){
					
					//file.renameTo(file1);
					
					System.out.println("File Exists.."+file.getName());
					
					//file.delete();
					//System.out.println(file.getName()+" renamed to "+file1.getName());
					
				}else{
					System.out.println("Directory Exists.."+file.getName());
					
					/*String[] names = file.list();
					for(String str : names){
						System.out.println(str);
					}*/
					
					File[] files = file.listFiles();
					for(File f : files){
						if(f.isDirectory())
							System.out.println(f.getName());
					}
				}
				
			}else{
				System.out.println("File does not Exists.."+file.getName());
				file.mkdir();
				//file.mkdirs();
				
				System.out.println(file.lastModified());
			}
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
			e.printStackTrace();
		}
		
		
		

	}

}
