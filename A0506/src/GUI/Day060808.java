package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Day060808 extends JFrame {
	Day060808() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel j1 = new JLabel("ID");
		JTextField j2 = new JTextField(10);
		JLabel j3 = new JLabel("PW");
		JPasswordField j4 = new JPasswordField(10);

		c.add(j1);
		c.add(j2);
		c.add(j3);
		c.add(j4);

		j2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String a = j2.getText();
				System.out.println(a);
			}
		});
		j4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				char[] a = j4.getPassword();
				System.out.println(a);
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new Day060808();
	}

}
