package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Day060707 extends JFrame {
	Day060707(){
		Container c= getContentPane();
		c.setBackground(Color.blue);
		JButton j1 = new JButton("Ok");
		JButton j2 = new JButton("Cancel");
		JButton j3 = new JButton("Get");
		c.add(j1);
		c.add(j2);
		c.add(j3);
		c.setLayout(new FlowLayout());
		j1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				c.setBackground(Color.orange);
			}
		});
		j2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				c.setEnabled(false);
			}
		});
		j3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(j3.getX()+ " " + j3.getY());
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new Day060707();

	}

}
