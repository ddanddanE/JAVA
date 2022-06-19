package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Day060708 extends JFrame{
	Day060708(){
		Container c=getContentPane();
		JCheckBox j = new JCheckBox("ÀÚ¹Ù");
		c.add(j);
		
		c.setLayout(new FlowLayout());
		j.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("happy java");
				}
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new Day060708();
	}

}
