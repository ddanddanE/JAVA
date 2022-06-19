package GUI;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Day060804 extends JFrame{
	Day060804(){
		Container c= getContentPane();
		int r=JOptionPane.showConfirmDialog(null,"계속할거야?",
				"confirm",JOptionPane.YES_NO_OPTION);
		
		if(r == JOptionPane.YES_OPTION) {
			System.out.println("yes");
		}
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Day060804();
	}
}
