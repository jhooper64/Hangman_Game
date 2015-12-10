package hangMan;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class HangmanPics extends JFrame
{
	public Graphics getGraphics1(){ 				// create method to hold a JFrame containing the witch picture - AO
		JPanel Start = new JPanel(); 				// creates a new JPanel - AO
		HangmanPics pic = new HangmanPics();			// show the image - AO
		pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 	// Closes JFrame without ending program - AO
		pic.setSize(600, 450);						//Creates the size of the JFrame - AO
		
		final JLabel label1; 						// JLabel with text and Icon		
		Icon GallowsStart = new ImageIcon(getClass().getResource("GallowsStart"));	//Will display the witch picture - AO
		label1 = new JLabel(); 						
		label1.setText("You have six tries to keep the little fellow alive.");		//A method that set the text to display the statement. - AO
		//label1.setIcon(Start); 						// add icon to JLabel - AO
		label1.setHorizontalTextPosition(SwingConstants.CENTER);	//Tells how to position the picture - AO
		label1.setVerticalTextPosition(SwingConstants.BOTTOM);
		Start.add(label1);// add label1 to JFrame	
		pic.add(Start);								//Adds the picture to the JFrame. - AO
		pic.setVisible(true);						//Makes the picture visible to the user. - AO
		return null;								//Doesn't return anything. - AO
	}
	
}
