package klosebrothers;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI {
	GUI(){
	JFrame frame = new JFrame ("Roman Numerals");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.setPreferredSize (new Dimension(500,500));
   
    frame.setLayout (new GridLayout ());
   
    final JTextField field1 = new JTextField(32);  
    frame.getContentPane ().add (field1);
   
    JButton button = new JButton ("OK");
    button.addActionListener(new ActionListener() {
       
    	
    	
       public void actionPerformed (ActionEvent e)
       {
          System.out.println ("Pressed");
          System.out.println (field1.getText ());
          if (FromArabicToRome.isInteger(field1.getText())) {
        	  
        	  field1.setText(FromArabicToRome.fromArabic(Integer.parseInt(field1.getText())));
          }
          
          else
          field1.setText(Integer.toString(FromRomeToArabicII.convert((field1.getText ()))));
       }
    });
    frame.getContentPane ().add (button);
    frame.pack ();
    frame.setVisible (true);
}}