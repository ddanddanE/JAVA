package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Day060701 extends JFrame{
	Day060701(){
		super("Java");
		setSize(300,300);
		setVisible(true);
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		
		Container c= getContentPane();
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);
		
		c.setLayout(new FlowLayout());
		c.setBackground(Color.cyan);
	}
	
	public static void main(String[] args) {
		new Day060701();
	}
}
