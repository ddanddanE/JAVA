package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Day060710 extends JFrame{
	Day060710(){
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j =new JLabel("안녕하세요");
		
		//ImageIcon i = new ImageIcon("~~~");
		//JLabel j1 = new JLabel(i);
		JLabel j2 = new JLabel("화요일이네요.",SwingConstants.CENTER);
		c.add(j);
		//c.add(j1);
		c.add(j2); 
		setVisible(true);
	}
	public static void main(String[] args) {
		new Day060710();

	}

}
