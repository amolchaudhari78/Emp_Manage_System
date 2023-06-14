package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Employee extends JFrame implements ActionListener{

	Employee(){
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		JLabel heading=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		heading.setBounds(80,30,1200,60);
		heading.setFont(new Font("times new roman",Font.PLAIN,60));
		heading.setForeground(Color.red);
		add(heading);
		
		JButton clickhere=new JButton("CLICK HERE TO CONTINUE");
		clickhere.setBounds(400,500,300,70);
		add(clickhere);
		clickhere.setBackground(Color.black);
		clickhere.setForeground(Color.white);
		clickhere.addActionListener(this);
		
		setSize(1170,650);	
		setLocation(200,50);
		setVisible(true);
		
		while(true) {
			heading.setVisible(false);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
			heading.setVisible(true);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}	
		}
	}
	
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Login();
	}
	public static void main(String[] args) {
	    new Employee();

	}
}
