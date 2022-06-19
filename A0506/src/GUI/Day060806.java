package GUI;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Day060806 extends JFrame{
	Day060806(){
		Container c= getContentPane();
		JOptionPane.showInputDialog("이름입력");
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Day060806();

	}

}
