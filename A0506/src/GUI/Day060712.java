package GUI;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Day060712 {

	public static void main(String[] args) {JFrame jf2=new JFrame();
	jf2.setLayout(new GridLayout(2,2));
	JButton jb1=new JButton("Button");
	JCheckBox cb1=new JCheckBox("Inactivate");
	JCheckBox cb2=new JCheckBox("Hide");
	cb1.addItemListener(new ItemListener() {
	@Override
	public void itemStateChanged(ItemEvent e) {
	// TODO Auto-generated method stub
	if(e.getStateChange()==ItemEvent.SELECTED) {
	jb1.setEnabled(false);
	}
	else {
	jb1.setEnabled(true);
	}
	}
	});
	cb2.addItemListener(new ItemListener() {
	@Override
	public void itemStateChanged(ItemEvent e) {
	// TODO Auto-generated method stub
	if(e.getStateChange()==ItemEvent.SELECTED) {
	jb1.setVisible(false);
	}
	else {
	jb1.setVisible(true);
	}
	}
	});
	jf2.add(cb1);
	jf2.add(cb2);
	jf2.add(jb1);
	jf2.setSize(500,500);
	jf2.setVisible(true);}

}
