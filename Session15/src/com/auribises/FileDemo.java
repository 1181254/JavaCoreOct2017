package com.auribises;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/myfile.php");
			//File file = new File("/Users/ishantkumar/Downloads","myfile.php");
			
			//File file = new File("/Users/ishantkumar/Downloads","yourfile.php");
			//File file = new File("/Users/ishantkumar/Downloads","yourfile.php");
			//File newFile = new File("/Users/ishantkumar/Downloads","file.php");
			
			/*if(file.exists()){
				if(file.isFile()){
					System.out.println(file.getName()+ " File Exists");
					file.renameTo(newFile);
				}else{
					System.out.println(file.getName()+ " Directory Exists");
					//file.delete();
				}
			}else{
				System.out.println(file.getName()+ " File Does Not Exists");
				//file.createNewFile();
				//file.mkdir();
				//file.mkdirs();
			}*/
			
			File file = new File("/Users/ishantkumar/Downloads");
			if(file.isDirectory()){
				/*String[] names = file.list();
				for(String s : names){
					System.out.println(s);
				}*/
				
				File[] files = file.listFiles();
				for(File f : files){
					if(f.isFile())
						System.out.println(f.getName());
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
