package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Day060803 extends JFrame{
	ImageIcon img[] = {new ImageIcon("C://Users//spery//Desktop/치킨.jpg"),new ImageIcon("C://Users//spery//Desktop//마라탕.jpg"),new ImageIcon("C://Users//spery//Desktop/치킨.jpg")};
	Day060803(){
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		JLabel j[] = new JLabel[3];
		
		for (int i = 0; i < 3; i++) {
			j[i] = new JLabel(img[i]);
			c.add(j[i]);
		}
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Day060803();
	}
}
