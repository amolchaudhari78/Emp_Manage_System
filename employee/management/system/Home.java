package employee.management.system;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Home extends JFrame implements ActionListener{

	JButton add,view,update,remove;
	
	Home(){
		setLayout(null);
		
		JLabel heading=new JLabel("Employee Management System");
		heading.setBounds(250,25,800,40);
		heading.setFont(new Font("Railway",Font.BOLD,43));
		add(heading);
		
		add=new JButton("Add Employee");
		add.setBounds(300,100,200,70);
		add.addActionListener(this);
		add(add);
		
		view=new JButton("View Employee's");
		view.setBounds(650,100,200,70);
		add.addActionListener(this);
		add(view);
		
		update=new JButton("Update Employee");
		update.setBounds(300,200,200,70);
		update.addActionListener(this);
		add(update);
		
		remove=new JButton("Remove Employee");
		remove.setBounds(650,200,200,70);
		remove.addActionListener(this);
		add(remove);
		
		setSize(1120,630);
		setLocation(250,100);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==add) {
			setVisible(false);
			new AddEmployee();
			
		}else if(ae.getSource()==view) {
			setVisible(false);
			new ViewEmployee();
		}else if(ae.getSource()==update) {
			setVisible(false);
			new ViewEmployee();
		}else {
			setVisible(false);
			new RemoveEmployee();
		}
	}
	public static void main(String[] args) {
		new Home();
	}
}
