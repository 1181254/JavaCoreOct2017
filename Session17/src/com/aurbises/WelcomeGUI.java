package com.aurbises;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WelcomeGUI implements ActionListener{
	
	// Reference Variables | And are null
	JFrame fr;
	JPanel pTitle, pName, pPhone, pPurpose,pButton,pAll;
	JLabel lTitle, lName, lPhone, lPurpose;
	JTextField tName, tPhone, tPurpose;
	JButton btn,btnClose;
	
	public WelcomeGUI(String name, String phone, String purpose) {
		
		// Create Objects
		fr = new JFrame("Welcome");
		
		pTitle = new JPanel();
		pName = new JPanel();
		pPhone = new JPanel();
		pPurpose = new JPanel();
		pButton = new JPanel();
		pAll = new JPanel();
		
		lTitle = new JLabel("Kindly Enter Details");
		lName = new JLabel("Whats Your Name");
		
		lPhone = new JLabel();
		lPhone.setText("Whats Your Phone");
	
		lPurpose =  new JLabel("Whats Your Purpose");
		
		tName = new JTextField(16);
		tPhone = new JTextField(16);
		tPurpose = new JTextField(16);
		
		btn = new JButton("Submit");
		btnClose = new JButton("Close");
		
		btn.addActionListener(this);
		btnClose.addActionListener(this);
		
		tName.setText(name);
		tPhone.setText(phone);
		tPurpose.setText(purpose);
		
	}
	
	void createUI(){
	
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
		//fr.setSize(400, 400);
		fr.pack();
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn){
			
			String name = tName.getText();
			String phone = tPhone.getText();
			String purpose = tPurpose.getText();
			
			System.out.println("Thank you "+name+"\nYour Phone number is: "+phone+"\nWe shall help to resolve your purpose : "+purpose);
			
		}else{
			fr.dispose();
		}
		
	}
	
	
}
