package com.auribises.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectPersistance {

	public static void main(String[] args) {
		
//		Employee e1 = new Employee(101,"John",30000);
//		Employee e2 = new Employee(102,"Jennie",40000);
//		
//		
//		System.out.println(e1);
//		System.out.println("--------");
//		System.out.println(e2);

		
		// Serialization - Persisting the state of an Object in a File
		/*try {
			
			File file = new File("/Users/ishantkumar/Downloads/students.dat");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e1);
			oos.close();
			fos.close();
			System.out.println("Object Saved... "+e1.name);
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}*/
		
		// De-Serialization - Reading the state of an Object from a File
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/students.dat");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee emp = (Employee)ois.readObject();
			
			System.out.println("Employee Details: \n"+emp);
			
			ois.close();
			fis.close();
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		
	}

}
