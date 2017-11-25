package com.auribises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(); // Generic Type
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<Employee> list3 = new ArrayList<Employee>();
		
		ArrayList list4 = new ArrayList(); // RAW Type
		
		List list5 = new ArrayList(); // Polymorphic Statement
		
		//1. Add the data in list
		list1.add(100); //0th index
		list1.add(200);
		list1.add(234);
		list1.add(123);
		list1.add(345); // n-1 index
		
		list2.add("John");
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("Jack");
		list2.add("Joe");
		list2.add("John");
		
		Employee e1 = new Employee();
		e1.eid = 101;
		e1.name = "Harry";
		Employee e2 = new Employee();
		e2.eid = 201;
		e2.name = "George";
		
		list3.add(e1); //0
		list3.add(e2); //1
		
		list4.add(10);
		list4.add("John");
		list4.add(e1);
		list4.add(2.2F);
		
		// 2. Read the list
		System.out.println("list1: "+list1);
		System.out.println("list2: "+list2);
		System.out.println("list3: "+list3);
		System.out.println("list4: "+list4);
		
		// 3. Size of the List
		int size = list2.size();
		System.out.println(size);
		
		// 4. Get a single element from list
		String name = list2.get(1);
		System.out.println(name);
		
		System.out.println("=======For Loop========");
		
		// 5. 1. Iterate in the List
		for(int i=0;i<list2.size();i++){
			System.out.println(list2.get(i));
		}
		
		System.out.println("=======Enhanced For Loop========");
		
		// 5. 2. Iterate in the List - Enhanced For Loop
		for(String str : list2){
			System.out.println(str);
		}
		
		System.out.println("=======Enhanced For Loop========");
		
		// 5. 2. Iterate in the List - Enhanced For Loop
		for(Employee e : list3){
			System.out.println(e);
		}
		
		System.out.println("=======Enhanced For Loop========");
		// 5. 2. Iterate in the List - Enhanced For Loop
		for(Object o : list4){
			System.out.println(o);
		}
		
		System.out.println("=======Interator========");
		// 5. 3. Iterator
		Iterator<String> itr = list2.iterator();
		while(itr.hasNext()){
			String s = itr.next();
			System.out.println(s);
		}
		
		System.out.println("=======Interator========");
		// 5. 3. Iterator
		Iterator<Object> itr1 = list4.iterator();
		while(itr1.hasNext()){
			Object o = itr1.next();
			System.out.println(o);
		}
		
		System.out.println("===============");
		// 6 Remove from list
		list2.remove(1);
		System.out.println(list2);
		
		System.out.println("===============");
		
		// 7 Update in list
		list2.set(1,"Jim Johnson");
		System.out.println(list2);
		
		//8 Element in list
		if(list2.contains("Jim Johnson")){
			System.out.println("Jim is in the List");
		}
		
		//9 Remove All the elements
		//list2.clear();
		
		System.out.println("list2: "+list2);

		if(list2.isEmpty()){
			System.out.println("list2 is empty");
		}
		
		ArrayList<String> list6 = new ArrayList<String>();
		list6.add("Fionna");
		list6.add("Frank");
		list6.add("Fini");
		list6.add("John");

		list2.addAll(list6);
		
		System.out.println("list2: "+list2);
		
	}

}
