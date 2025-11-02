package bank;
import javax.swing.*;
import java.awt.*;
import java.sql.Date;

public class Signup extends JFrame{
	JLabel l1,l2,l3,ldob,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tfdob,tf10,tfdate;
	JButton btnsubmit,btnclear;
	JRadioButton maleButton,femaleButton;
	
	
	
	
	public Signup() {
		setLayout(null);
		l1= new JLabel("Account Registration Form");
		l1.setBounds(120,10,800,60);
		l1.setFont(new Font("Raleway",Font.BOLD,40));
		add(l1);
		l2= new JLabel("Full Name");
		l2.setBounds(50,100,400,40);
		l2.setFont(new Font("Raleway",Font.BOLD,25));
		add(l2);
		
		tf1=new JTextField(20);
		tf1.setBounds(50,150,200,30);
		tf1.setFont(new Font("Tahoma", Font.BOLD,20));
		add(tf1);
		
		ldob= new JLabel("Date of Birth (YYYY-MM-DD):");
		ldob.setBounds(400,100,400,40);
		ldob.setFont(new Font("Raleway",Font.BOLD,25));
		add(ldob);
		
		tfdob= new JTextField(20);
		tfdob.setBounds(400,150,200,30);
		tfdob.setFont(new Font("Raleway",Font.BOLD,25) );
		add(tfdob);
		

	    // --- Address ---
	    l3 = new JLabel("Address");
	    l3.setBounds(50, 200, 400, 40);
	    l3.setFont(new Font("Raleway", Font.BOLD, 25));
	    add(l3);

	    tf2 = new JTextField(50);
	    tf2.setBounds(50, 250, 600, 30);
	    tf2.setFont(new Font("Tahoma", Font.BOLD, 20));
	    add(tf2);

	    // --- City ---
	    l4 = new JLabel("City");
	    l4.setBounds(50, 300, 400, 40);
	    l4.setFont(new Font("Raleway", Font.BOLD, 25));
	    add(l4);

	    tf3 = new JTextField(20);
	    tf3.setBounds(50, 350, 250, 30);
	    tf3.setFont(new Font("Tahoma", Font.BOLD, 20));
	    add(tf3);

	    // --- Pincode ---
	    l5 = new JLabel("Pincode");
	    l5.setBounds(400, 300, 400, 40);
	    l5.setFont(new Font("Raleway", Font.BOLD, 25));
	    add(l5);

	    tf4 = new JTextField(10);
	    tf4.setBounds(400, 350, 200, 30);
	    tf4.setFont(new Font("Tahoma", Font.BOLD, 20));
	    add(tf4);
		// ---- Gender ---
	    l6 = new JLabel("Gender");
	    l6.setBounds(50, 400, 400, 40);
	    l6.setFont(new Font("Raleway", Font.BOLD, 25));
	    add(l6);
	    
	    
	    maleButton = new JRadioButton("Male");
	    maleButton.setBounds(50, 450, 100, 30);
	    maleButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    maleButton.setBackground(Color.white);
	    add(maleButton);

	    femaleButton = new JRadioButton("Female");
	    femaleButton.setBounds(160, 450, 120, 30);
	    femaleButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    femaleButton.setBackground(Color.white);
	    add(femaleButton);

	    ButtonGroup genderGroup = new ButtonGroup();
	    genderGroup.add(maleButton);
	    genderGroup.add(femaleButton);
	    l7 = new JLabel("Phone Number");
	    l7.setBounds(400, 400, 400, 40);
	    l7.setFont(new Font("Raleway", Font.BOLD, 25));
	    add(l7);

	    tf5 = new JTextField(15);
	    tf5.setBounds(400, 450, 250, 30);
	    tf5.setFont(new Font("Tahoma", Font.BOLD, 20));
	    add(tf5);

		
		
		setTitle("Signup page");
		getContentPane().setBackground(Color.white);
		setSize(800,600);
		setLocation(400,200);
		setVisible(true);
		
		
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Signup obj = new Signup();
	}

}
