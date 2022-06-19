package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Day060713 extends JFrame{
	Day060713(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("name"));
		c.add(new JTextField(20));
		
		c.add(new JLabel("adress"));
		c.add(new JTextField(20));
		
		c.add(new JTextArea(10,20));
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Day060713();
	}

}
