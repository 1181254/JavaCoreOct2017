package com.auribises.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

class Employee{
	
}

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>(); // RTP
		ArrayList<String> list2 = new ArrayList<String>(); // DS
		ArrayList list3 = new ArrayList(); // RAW Type
		ArrayList<Employee> list4 = new ArrayList<Employee>(); 
		
		Stack<String> stack = new Stack<String>(); // LIFO
		
		// Add Data to the list
		list1.add("John"); //0
		list1.add("Jennie");
		list1.add("Jack");
		list1.add("Jack");
		list1.add("Jim");
		list1.add("Joe"); //n-1
		//list1.add(100); error
		
		list3.add("Jim");
		list3.add(100); // list3.add(new Integer(100))
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		list3.add(e1);
		list3.add(e2);
		
		list4.add(e1);
		list4.add(e2);
		
		// Read the list
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println(list4);

		// Read Single Element
		String name = list1.get(0);
		System.out.println(name);
		
		// Read All
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}
		System.out.println("============");
		for(String str : list1){
			System.out.println(str);
		}
		System.out.println("============");
		for(Object o : list3){
			System.out.println(o);
		}
		System.out.println("============");
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()){
			String nm = itr.next();
			System.out.println(nm);
			
			//if(nm.equals("Jim"))
			//	itr.remove();
		}
		System.out.println("============");
		ListIterator<String> litr = list1.listIterator();
		while(litr.hasNext()){
			String nm = litr.next();
			System.out.println(nm);
			
			//if(nm.equals("Jim"))
			//	itr.remove();
		}
		System.out.println("============");
		while(litr.hasPrevious()){
			String nm = litr.previous();
			System.out.println(nm);
			
			//if(nm.equals("Jim"))
			//	itr.remove();
		}
		
		System.out.println("============");
		Enumeration<String> enm = Collections.enumeration(list1);
		while(enm.hasMoreElements()){
			String nm = enm.nextElement();
			System.out.println(nm);
		}
		
		// Update the Data
		list1.set(1, "Harry");
		System.out.println(list1);
		
		// Remove the Data
		list1.remove(1);
		System.out.println(list1);
		
		//list1.clear();
		
		//list1.addAll(list2);
		
		if(list1.contains("John"))
			System.out.println("John is in the list");
		
		System.out.println(list1.indexOf("Jim"));
		
		Vector<String> vector = new Vector<String>(); // THREAD-SAFE (Vector is Sync)
		vector.add("John"); //0
		vector.add("Jennie");
		vector.add("Jack");
		vector.add("Jim");
		vector.add("Joe"); //n-1
		System.out.println("vector is: "+vector);
		
		List list = new Vector();
		list = new ArrayList();
		
		System.out.println("========================");
		Set<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		HashSet set3 = new HashSet();
		set2.add("John");
		set2.add("Jennie");
		set2.add("Jack");
		set2.add("Jack");
		set2.add("Jim");
		set2.add("Jim");
		set2.add("Joe"); 
		
		System.out.println(set2);
		
		Iterator<String> itr1 = set2.iterator();
		while(itr1.hasNext()){
			String nm = itr1.next();
			System.out.println(nm);
		}
		
		System.out.println("========================");
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("John");
		set.add("Jennie");
		set.add("Jack");
		set.add("Jack");
		set.add("Jim");
		set.add("Jim");
		set.add("Joe"); 
		
		System.out.println(set);
		
		// Use Comparator API for Sorting User Defined Objects - Explore
		
		System.out.println("========================");
		Queue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=10;i>0;i--){
			queue.add(i);
		}
		
		System.out.println(queue);
		
		//System.out.println(queue.peek());
		//System.out.println(queue.poll());
		//System.out.println(queue.peek());
		//System.out.println(queue.poll());
		
		for(int i=0;i<10;i++){
			System.out.println(queue.poll());
		}
		
		System.out.println("========================");
		//Map<Integer,String> map = new HashMap<Integer,String>();
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(101, "John");
		map.put(112, "Jennie");
		map.put(1456, "Jim");
		map.put(321, "Jack");
		map.put(1123, "Joe");
		map.put(112, "George"); // Update
		map.put(137, null);
		map.put(null, null);
		map.put(null, "Fionna");
		
		System.out.println(map);
		
		String value = map.get(112);
		System.out.println(value);
		
		//map.remove(112);
		//map.clear();
		
		//if(map.containsKey(112))
		System.out.println("========================");
		Set<Integer> keys = map.keySet();
		Iterator<Integer> itr3 = keys.iterator();
		while(itr3.hasNext()){
			Integer key = itr3.next();
			String val = map.get(key);
			System.out.println(key+" - "+val);
		}
		
		System.out.println(map.get(null));
		
		Hashtable<Integer,String> table = new Hashtable<Integer,String>(); // Thread-Safe
		table.put(101, "John");
		table.put(112, "Jennie");
		table.put(1456, "Jim");
		table.put(321, "Jack");
		table.put(1123, "Joe");
		table.put(112, "George"); // Update
		//table.put(137, null);
		//table.put(null, null);
		//table.put(null, "Fionna");
		
		System.out.println(table);
	}

}
