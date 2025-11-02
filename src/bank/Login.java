package bank;
//ctrl+shift+o se saare uske andr joh imports ke andr joh joh classes hai woh aagyi
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {//all those classes with J belongs to swing package 
	//Instance Variable
	JLabel lwelcome,lcardnumber,lpinnumber;
	JTextField tfcardnumber;
	JPasswordField pfpinnumber;
	JButton btnlogin,btnClear,btnSignup;
	
	
	//NON PARAM CONSTRUCTOR
	public Login() {
		setLayout(null);
		lwelcome= new JLabel("Welcome to Bank Management");
		lwelcome.setFont(new Font("Arial",Font.BOLD,35));
		lwelcome.setBounds(200,40,530,40);
		add(lwelcome);
		
		lcardnumber= new JLabel("Enter Card No.");
		lcardnumber.setFont(new Font("Tahoma",Font.BOLD,20));
		lcardnumber.setBounds(100,100,800,60);
		add(lcardnumber);
		
		
		tfcardnumber= new JTextField(20);
		tfcardnumber.setBounds(300,110,230,30);
		tfcardnumber.setFont(new Font("Tahoma",Font.BOLD,20));
		add(tfcardnumber);
	
		lpinnumber= new JLabel("Enter PIN");
		lpinnumber.setFont(new Font("Tahoma",Font.BOLD,20));
		lpinnumber.setBounds(100,150,800,60);
		add(lpinnumber);
		
		pfpinnumber= new JPasswordField(20);
		pfpinnumber.setBounds(300,165,230,30);
		pfpinnumber.setFont(new Font("Tahoma",Font.BOLD,20));
		add(pfpinnumber);	
		
		btnlogin= new JButton("Login");
		btnlogin.setBackground(Color.black);
		btnlogin.setForeground(Color.white);
		
		btnClear= new JButton("Clear");
		btnClear.setBackground(Color.black);
		btnClear.setForeground(Color.white);
		
		btnSignup= new JButton("Sign Up");
		btnSignup.setBackground(Color.black);
		btnSignup.setForeground(Color.white);
		
		btnlogin.setFont(new Font("Arial", Font.BOLD,15));
		btnlogin.setBounds(100,250,100,50);
		add(btnlogin);
		btnClear.setFont(new Font("Arial", Font.BOLD,15));
		btnClear.setBounds(300,250,100,50);
		add(btnClear);
		
		btnSignup.setFont(new Font("Arial", Font.BOLD,15));
		btnSignup.setBounds(500,250,100,50);
		add(btnSignup);
		
		btnlogin.addActionListener(this);
		btnClear.addActionListener(this);
		btnSignup.addActionListener(this);
		//TITLE
		setTitle("Bank Management System");//this will be the name of the frame which will be created
		
		
		//Changing the background 
		getContentPane().setBackground(Color.white); 
		setVisible(true);
		setSize(800,500);//units in pixels
		setLocation(400,200);
		
	}
   
	public static void main(String[] args) {
		//creating login class object
		Login obj=new Login();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	try {
		if(e.getSource()==btnlogin) {
			// this is for login purpose
		}
		else if(e.getSource()==btnClear) {
			//this is for clear purpose
			tfcardnumber.setText("");
			pfpinnumber.setText("");
		}
		else if(e.getSource()==btnSignup) {
			//this is for sign up button
		}
		
	} 
	catch (Exception e2) {
		e2.printStackTrace();
	}
		
	}

}
