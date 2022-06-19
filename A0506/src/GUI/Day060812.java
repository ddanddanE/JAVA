package GUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Day060812 extends JFrame {
	Day060812() {
		Container c = getContentPane();

		JMenuBar j = new JMenuBar();
		JMenu j1 = new JMenu("File");

		JMenuItem j2 = new JMenuItem("Load");
		JMenuItem j3 = new JMenuItem("Hide");
		JMenuItem j4 = new JMenuItem("Exit");

		JLabel jl = new JLabel();
		ImageIcon img = new ImageIcon("C://Users//spery//Desktop/ġŲ.jpg");

		setJMenuBar(j);
		j.add(j1);
		j1.add(j2);
		j1.add(j3);
		j1.add(j4);
		
		c.add(jl);

		j2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setIcon(img);
			}
		});
		j3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jl.hide();
			}
		});
		j4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}

		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new Day060812();
	}

}
