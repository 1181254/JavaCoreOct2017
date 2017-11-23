package com.auribises.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EnquiryGUI implements ActionListener{
	
	// Reference Variables | And are null
	Frame fr;
	Panel pTitle, pName, pPhone, pPurpose,pButton,pAll;
	Label lTitle, lName, lPhone, lPurpose;
	TextField tName, tPhone, tPurpose;
	Button btn,btnClose;
	
	public EnquiryGUI() {
		
		// Create Objects
		fr = new Frame("Enquiry");
		
		pTitle = new Panel();
		pName = new Panel();
		pPhone = new Panel();
		pPurpose = new Panel();
		pButton = new Panel();
		pAll = new Panel();
		
		lTitle = new Label("Kindly Enter Details");
		lName = new Label("Whats Your Name");
		
		lPhone = new Label();
		lPhone.setText("Whats Your Phone");
	
		lPurpose =  new Label("Whats Your Purpose");
		
		tName = new TextField(16);
		tPhone = new TextField(16);
		tPurpose = new TextField(16);
		
		btn = new Button("Submit");
		btnClose = new Button("Close");
		
		btn.addActionListener(this);
		btnClose.addActionListener(this);
				
	}
	
	public void createUI(){
	
		pTitle.add(lTitle);
		
		pName.add(lName);
		pName.add(tName);

		pPhone.add(lPhone);
		pPhone.add(tPhone);
		
		pPurpose.add(lPurpose);
		pPurpose.add(tPurpose);
		
		pButton.add(btn);
		pButton.add(btnClose);
		
		pAll.add(pTitle);
		pAll.add(pName);
		pAll.add(pPhone);
		pAll.add(pPurpose);
		pAll.add(pButton);
		
		GridLayout layout = new GridLayout(5, 1);
		pAll.setLayout(layout);
		
		fr.add(pAll);
		fr.pack();
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn){
			
			String name = tName.getText();
			String phone = tPhone.getText();
			String purpose = tPurpose.getText();
			
			// JDBC Procedure
			try {
				
				// 1. Load the Driver 
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("--Driver Loaded--");
				
				// 2. Create a Connection
				String user = "root";
				String password = "";
				String url = "jdbc:mysql://localhost/auribises";
				
				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("--Connection Created--");
				
				// 3. Write SQL Statement
				String sql = "insert into Enquiry values(null,'"+name+"','"+phone+"','"+purpose+"')";
				
				// 4. Execute SQL Statement
				Statement stmt = con.createStatement();
				int i = stmt.executeUpdate(sql);

				if(i>0){
					System.out.println("Enquiry Saved in DB "+i);
					tName.setText("");
					tPhone.setText("");
					tPurpose.setText("");
				}else{
					System.out.println("OOPS! Something Went Wrong");
				}
				
				//5. Close the Connection
				con.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			
			System.out.println("Thank you "+name+"\nYour Phone number is: "+phone+"\nWe shall help to resolve your purpose : "+purpose);
			
			
		}else{
			fr.dispose();
		}
		
	}

	
}
