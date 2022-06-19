package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Day060810 extends JFrame{
	
	Day060810(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,5));
		
		Color c1[] = {Color.red,Color.orange,Color.yellow,Color.green,Color.black};
		JButton j[] = new JButton[5];
		
		for (int i = 0; i < j.length; i++) {
			j[i] = new JButton(i+" ");
			j[i].setBackground(c1[i]);
			c.add(j[i]);
		}
		 c.setSize(450,300);
		 
		setVisible(true);
	}
	public static void main(String[] args) {
		new Day060810();
	}

}
