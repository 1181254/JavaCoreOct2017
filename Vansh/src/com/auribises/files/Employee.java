package com.auribises.files;

import java.io.Serializable;

public class Employee implements Serializable{

	int eid;
	String name;
	transient int salary; // Which cannot be Serialized
	
	Employee(){
		
	}
	
	Employee(int e, String n, int s){
		eid = e;
		name = n;
		salary = s;
	}
	
	@Override
	public String toString() {
		return "Employee ID: "+eid+"\nEmoloyee Name: "+name+"\nEmployee Salary: "+salary;
	}
	
}
