package com.auribises.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;

class Emp{
	int eid;
	String name;
	int age;
	
	Emp(){
		
	}
	
	Emp(int i, String n, int a){
		eid = i;
		name = n;
		age = a;
	}
	
	@Override
	public String toString() {
		return eid+" - "+name+" - "+age;
	}
	
}

public class JDBCDemo {
	public static void main(String[] args) {
		
		Statement stmt;
		
		PreparedStatement pStmt;
		
		Connection con;
		
		String url = "jdbc:mysql://localhost/auribises";
		String user = "root";
		String password = "";
		
		String sql;
		
		String name = "Ria";
		int age = 20;
		
		try {
			
			//1. Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Create the Connection
			con = DriverManager.getConnection(url, user, password);
			
			//3. Write SQL Statement
			//sql = "insert into Employee values(null,'Kevin',30)";
			//sql = "insert into Employee values(null,'"+name+"',"+age+")";
			//sql = "insert into Employee values(null,?,?)";
			sql = "select * from Employee";
			
			//4. Execute SQL Statement
			//stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql); // Insert, Update and Delete Operations
			
			pStmt = con.prepareStatement(sql);
			//pStmt.setString(1, name);
			//pStmt.setInt(2, age);
			
			//int i = pStmt.executeUpdate();
			
			//if(i>0){
			//	System.out.println("Record Inserted: "+i);
			//}else{
			//	System.out.println("Record Not Inserted: "+i);
			//}

			ResultSet rs = pStmt.executeQuery();
			
			int e=0,a=0;
			String n = "";
			
			ArrayList<Emp> empList = new ArrayList<Emp>();
			
			while(rs.next()){
				e = rs.getInt(1);
				n = rs.getString(2);
				a = rs.getInt(3);
				
				//System.out.println(e+" - "+n+" - "+a);
				//System.out.println("------------------------");
				
				Emp emp = new Emp(e,n,a);
				empList.add(emp);
			}
			
			for(Emp eRef : empList){
				System.out.println(eRef);
				System.out.println("------------------------");
			}
			
			
			//5. Close the Connection
			con.close();
			 
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}

	}
}
