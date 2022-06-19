package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Day060802 extends JFrame{
	String s[]= {"Ä¡Å²","¸¶¶óÅÁ"};
	ImageIcon im[] = {new ImageIcon("C://Users//spery//Desktop/Ä¡Å².jpg"),new ImageIcon("C://Users//spery//Desktop//¸¶¶óÅÁ.jpg")};
	JLabel j = new JLabel(im[0]);
	
	Day060802(){
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox com = new JComboBox(s);
		com.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox c = (JComboBox)e.getSource();
				int i = c.getSelectedIndex();
				j.setIcon(im[i]);
			}
		});
		c.add(j);
		c.add(com);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Day060802();
	}

}
