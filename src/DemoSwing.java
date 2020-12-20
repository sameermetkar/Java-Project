import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;

import javax.swing.*;
import java.lang.*;

class demo extends JFrame implements ActionListener 
 {
	
    JLabel l1, l2, l3, l4, l5, bg;
	
    Font fn, fn1, fn2;
    
    JTextField tf1, tf2, tf3, tf4;	
	
    JPasswordField password;

    JButton b1,b2;
	
    ImageIcon img;	
	
    JCheckBox cb;

    demo()
	{
        setTitle("Demo Swing");
		
        img = new ImageIcon("Images/demo.jpg");       //background-image

        bg = new JLabel("", img, JLabel.CENTER);        //BG-image set size
        bg.setBounds(0, 0, 1366, 768);

        
        fn = new Font("Times New Roman", Font.PLAIN, 25);   //font styles
        fn1 = new Font("Centeria Script", Font.BOLD, 35);
        fn2 = new Font("Times New Roman", Font.PLAIN, 17);
		
		l1 = new JLabel();
        l1.setText("Name :");
        l1.setBounds(860, 170, 250, 40);
        l1.setFont(fn);
        l1.setForeground(Color.white);
        		
		l2 = new JLabel();
        l2.setText("Email :");
        l2.setBounds(860, 240, 250, 40);
        l2.setFont(fn);
        l2.setForeground(Color.white);
        
		l3 = new JLabel();
        l3.setText("Username :");
        l3.setBounds(815, 310, 250, 40);
        l3.setFont(fn);
        l3.setForeground(Color.white);
        
		l4 = new JLabel();
        l4.setText("Password :");
        l4.setBounds(820, 380, 250, 40);
        l4.setFont(fn);
        l4.setForeground(Color.white);
        
	    l5 = new JLabel();
        l5.setText(" Login Page Using Java-Swing ");
        l5.setBounds(750, 20, 900, 100);
        l5.setFont(fn1);
        l5.setForeground(Color.white);
        
        tf1 = new JTextField();
        tf1.setBounds(950, 170, 250, 35);
        tf1.setFont(fn2);
		
		tf2 = new JTextField();
        tf2.setBounds(950, 240, 250, 35);
        tf2.setFont(fn2);
		
		tf3 = new JTextField();
        tf3.setBounds(950, 310, 250, 35);
        tf3.setFont(fn2);
		
		tf4 = new JTextField();
        tf4.setBounds(950,450, 250, 35);
        tf4.setFont(fn2);
		
		b1 = new JButton("Login");
        b1.setBounds(850,540,120,30);
        b1.setFont(fn2);
		
        b2 = new JButton("Exit");
        b2.setBounds(1050,540,120,30);
		b2.setFont(fn2);
		
		cb=new JCheckBox("show password");
		cb.setBounds(950,450,200,30);
		cb.setFont(fn2);
		
		password =new JPasswordField();
		password.setBounds(950, 380, 250, 35);
		password.setFont(fn);
		
		bg.add(l1);
        bg.add(l2);
        bg.add(l3);
        bg.add(l4);
        bg.add(l5);

        bg.add(tf1);
        bg.add(tf2);
        bg.add(tf3);
        
		add(bg);
		
		bg.add(b1);
		bg.add(b2);
		
		bg.add(cb);
		
		bg.add(password);
		
 		b1.addActionListener(this);
        b2.addActionListener(this);
        	
		cb.addActionListener(this);
        
		setSize(1366, 768);
        setLayout(null);
        setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

    }// end of pageone constructor 
	public void actionPerformed(ActionEvent e)          //Action-Listener
{    
                String s1 = tf1.getText(); 
                String s2 = tf2.getText(); 
                String s3 = tf3.getText();
                String s4 = tf4.getText();
				char[] input = password.getPassword();
				String s = String.valueOf(input);
		 

if(e.getSource()==b1)
    
{           

}



if(e.getSource()==b2)
{
 System.exit(0);

}

if(cb.isSelected())
{
  password.setEchoChar((char)0);
}else
{
	password.setEchoChar('*');
}

} // end of actionperformed 
} // end of pageone class


class DemoSwing
{
    public static void main(String args[])
	{
        new demo();
    } //end of main
} //end of class