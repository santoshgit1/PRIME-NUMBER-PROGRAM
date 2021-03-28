package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PRIME_NUMBER extends JFrame implements ActionListener
{
	PRIME_NUMBER() 
	{
	   getContentPane().setBackground(Color.DARK_GRAY);
//-------------------------------------------------------------------------------------	   
	   JLabel l = new JLabel();
	   l.setIcon(new ImageIcon("PROGRAM_IMG\\PRIME_NUMBER_PRIMENO.PNG"));
	   l.setBounds(0, -60, 1000, 1000); 
	   getContentPane().add(l);
	
	   setSize(810,920);   // WIDTH, HEIGHT
	   getContentPane().setLayout(null);
	   setVisible(true);
	}	
//---------------------------------------------------------------------------------	
    public void actionPerformed(ActionEvent arg0) {}

    public static void main(String[] args) 
	{
	   new PRIME_NUMBER();
	}
	
}