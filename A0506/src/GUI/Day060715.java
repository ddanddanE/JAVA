package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Day060715 extends JFrame {
	Day060715() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.red);
		// 1.
		JButton jb1 = new JButton("Ok");
		JButton jb2 = new JButton("Cancel");
		c.add(jb1);
		c.add(jb2);

		jb1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				jb1.setText("»Æ¿Œ");
			}
		});
		jb2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				jb2.setEnabled(false);
			}
		});
		// 2.
		JRadioButton jrb1 = new JRadioButton("magenta");
		JRadioButton jrb2 = new JRadioButton("red");
		c.add(jrb1);
		c.add(jrb2);
		jrb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					c.setBackground(Color.magenta);
				}
			}
		});
		jrb2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					c.setBackground(Color.red);
				}
			}
		});
		// 3.
		JLabel j = new JLabel("Hi");
		c.add(j);
		j.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				j.setText("æ»≥Á");
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new Day060715();

	}

}
