package com.aurbises;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EnquiryGUI implements ActionListener,FocusListener,MouseListener,MouseMotionListener{
	
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
		
		tPhone.addFocusListener(this);
		
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
		
		//fr.add(pAll);
		fr.addMouseListener(this);
		fr.addMouseMotionListener(this);
		fr.setSize(400, 400);
		//fr.pack();
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn){
			
			String name = tName.getText();
			String phone = tPhone.getText();
			String purpose = tPurpose.getText();
			
			System.out.println("Thank you "+name+"\nYour Phone number is: "+phone+"\nWe shall help to resolve your purpose : "+purpose);
			
			WelcomeGUI wGui = new WelcomeGUI(name,phone,purpose);
			wGui.createUI();
			fr.dispose();
			
		}else{
			fr.dispose();
		}
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("Focus Gained");
	}

	@Override
	public void focusLost(FocusEvent e) {
		String phone = tPhone.getText();
		
		if(phone.length()!=10){
			lTitle.setText("Please Enter Correct Phone");
		}else{
			lTitle.setText("Kindly Enter Details");
		}
		
		System.out.println("Focus Lost");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked: "+e.getX()+" : "+e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed: "+e.getX()+" : "+e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased: "+e.getX()+" : "+e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered: "+e.getX()+" : "+e.getY());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited: "+e.getX()+" : "+e.getY());
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouseDragged: "+e.getX()+" : "+e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouseMoved: "+e.getX()+" : "+e.getY());
	}
	
	
}
