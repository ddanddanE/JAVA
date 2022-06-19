package Day0609;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Day060903 extends JFrame{
	Day060903(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,3));
		JLabel j[]= new JLabel[12];
		for (int i = 0; i < j.length; i++) {
			j[i] = new JLabel(i+"");
			j[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int ranRed= (int) (Math.random()*255);
					int ranGreen= (int) (Math.random()*255);
					int ranblue= (int) (Math.random()*255);
					JLabel j1=(JLabel) e.getSource();
					j1.setOpaque(true);
					j1.setBackground(new Color(ranRed, ranGreen, ranblue));
				}
			});
			c.add(j[i]);
		}
		c.setBackground(Color.white);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Day060903();
	}

}
