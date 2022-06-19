package GUI;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Day060709 extends JFrame{
	Day060709(){
		Container c=getContentPane();
		JCheckBox j []= new JCheckBox[15];
		c.setLayout(new GridLayout(3,5));
		for (int i = 0; i < j.length; i++) {
			j[i] = new JCheckBox("üũ"+(i+1));
			c.add(j[i]);
		}
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Day060709();
	}

}
