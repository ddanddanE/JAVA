package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Day060809 extends JFrame{
	Day060809(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JSlider j =new JSlider(100,200);
		JLabel j1 = new JLabel(" ");
		
		c.add(j);
		c.add(j1);
		
		j.setMajorTickSpacing(20);
		j.setPaintLabels(true);
		j.setPaintTicks(true);
		
		j1.setOpaque(true);
		j1.setHorizontalAlignment(JLabel.CENTER);
		j1.setBackground(Color.magenta);
		
		j.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				j1.setText(Integer.toString(j.getValue()));
				
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new Day060809();

	}

}
