package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{

	JTextField tfusername,tfpasword;
	Login(){
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		JLabel lblusername=new JLabel("Username");
		lblusername.setBounds(40,20,100,30);
		add(lblusername);
		

		JLabel lblpassword=new JLabel("Password");
		lblpassword.setBounds(40,70,100,30);
		add(lblpassword);
		
		tfusername=new JTextField();
		tfusername.setBounds(150,20,150,30);
		add(tfusername);
		
		tfpasword=new JTextField();
		tfpasword.setBounds(150,70,150,30);
		add(tfpasword);
		
		JButton login=new JButton("LOGIN");
		login.setBounds(150,140,150,30);
		add(login);
		login.setBackground(Color.black);
		login .setForeground(Color.white);
		login.addActionListener(this);
		
		setSize(600,300);
		setLocation(450,200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		try {
			String username=tfusername.getText();
			String password=tfpasword.getText();
			Conn c=new Conn();
			String query="select * from login where username = '"+username+"' and password = '"+password+"'";
			
			ResultSet rs=c.s.executeQuery(query);
			if(rs.next()) {
				setVisible(false);
				new Home();
			}else {
				JOptionPane.showMessageDialog(null, "Invalid username or password");
				setVisible(false);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Login();
	}
}
