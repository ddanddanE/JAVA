package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Day060702 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setLayout(new BorderLayout(30,20));//hgap, vgap)
		
		j.add(new JButton("��"),BorderLayout.EAST);
		j.add(new JButton("��"),BorderLayout.WEST);
		j.add(new JButton("��"),BorderLayout.SOUTH);
		j.add(new JButton("��"),BorderLayout.NORTH);
		j.add(new JButton("�߾�"),BorderLayout.CENTER);
		
		j.setVisible(true);
	}
}
