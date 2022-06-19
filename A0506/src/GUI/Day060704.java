package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Day060704 extends JFrame{
	Day060704(){
		Container c = getContentPane();
		
		JButton j1 = new JButton("one");
		JButton j2 = new JButton("two");
		c.add(j1);
		c.add(j2);
		c.setLayout(new FlowLayout());
		
		j1.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println(e.getX()+","+e.getY());
			}
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println(e.getX()+","+e.getY());
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new Day060704();
	}

}
