package com.auribises.jdbc;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyGUI implements ActionListener,FocusListener, MouseListener, MouseMotionListener, WindowListener{
	
	JFrame fr;
	JLabel lblTitle, lblName, lblPhone;
	JTextField txtName, txtPhone;
	JButton btnSubmit,btnCancel;
	JPanel pAll, pTitle, pName, pPhone, pBtn;
	
	MyGUI(){
		
		fr = new JFrame("MyGUI");
		//fr.setTitle("MyGUI");
		
		lblTitle = new JLabel("Kindly Enter Your Details");
		lblName = new JLabel("Enter Your Name");
		lblPhone = new JLabel();
		lblPhone.setText("Enter Your Phone");
		
		txtName = new JTextField(16);
		txtPhone = new JTextField(16);
		
		btnSubmit = new JButton("Submit");
		btnCancel = new JButton("Cancel");
		//btnSubmit.setLabel("Submit");
		
		btnSubmit.addActionListener(this);
		btnCancel.addActionListener(this);
		
		pAll = new JPanel();
		pTitle = new JPanel();
		pName = new JPanel();
		pPhone = new JPanel();
		pBtn = new JPanel();
	}
	
	void createFrame(){
		pTitle.add(lblTitle);
		
		pName.add(lblName);
		pName.add(txtName);
		
		pPhone.add(lblPhone);
		pPhone.add(txtPhone);
		
		pBtn.add(btnSubmit);
		pBtn.add(btnCancel);

		pAll.add(pTitle);
		pAll.add(pName);
		pAll.add(pPhone);
		pAll.add(pBtn);
		
		GridLayout layout = new GridLayout(4, 1);
		pAll.setLayout(layout);
		
		fr.add(pAll);
		//fr.setSize(200, 200);
		fr.pack();
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnSubmit){
			String name = txtName.getText();
			String phone = txtPhone.getText();
			
			System.out.println(name+" - "+phone);
			
			// JDBC Code 
			//
			
		}else{
			fr.dispose();
		}
	}
	
}

public class GUIDemo {

	public static void main(String[] args) {
		
		MyGUI gui = new MyGUI();
		gui.createFrame();

	}

}
