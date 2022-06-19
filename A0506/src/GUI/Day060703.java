package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Day060703 extends JFrame {
	Day060703() {
		JButton jb1 = new JButton("¾È³ç");
		jb1.addActionListener(null);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jb1);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Day060703();
	}
}
