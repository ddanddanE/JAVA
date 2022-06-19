package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Day060702 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setLayout(new BorderLayout(30,20));//hgap, vgap)
		
		j.add(new JButton("µ¿"),BorderLayout.EAST);
		j.add(new JButton("¼­"),BorderLayout.WEST);
		j.add(new JButton("³²"),BorderLayout.SOUTH);
		j.add(new JButton("ºÏ"),BorderLayout.NORTH);
		j.add(new JButton("Áß¾Ó"),BorderLayout.CENTER);
		
		j.setVisible(true);
	}
}
