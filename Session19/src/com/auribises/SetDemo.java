package com.auribises;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		//HashSet<String> set1 = new HashSet<String>();
		Set set2 = new HashSet();
		
		TreeSet<String> set1 = new TreeSet<String>();
		
		set1.add("John");
		set1.add("Jim");
		set1.add("Jack");
		set1.add("Jennie");
		set1.add("John");
		set1.add("Joe");
		
		System.out.println(set1);
		
		set1.remove("Jim");
		
		Iterator<String> itr = set1.iterator();
		while(itr.hasNext()){
			String n = itr.next();
			System.out.println(n);
		}
		

	}

}
