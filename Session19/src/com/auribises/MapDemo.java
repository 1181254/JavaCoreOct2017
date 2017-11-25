package com.auribises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "John");
		map.put(322, "Jennie");
		map.put(123, "Kim");
		map.put(356, "Sam");
		map.put(987, "Fionna");
		map.put(322, "Kim");
		
		System.out.println(map);
		
		System.out.println(map.size());
		
		if(map.containsKey(101)){
			
		}
		
		System.out.println(map.get(322));
		
		Set<Integer> keys = map.keySet();
		
		System.out.println("=============");
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			int key = itr.next();
			String value = map.get(key);
			System.out.println(key+" - "+value);
		}
		
	}

}
