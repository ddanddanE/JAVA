package GUI;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Day060805 extends JFrame {
	Day060805(){
		Container c= getContentPane();
		JOptionPane.showMessageDialog(null,"조심하세요",
				"메세지",JOptionPane.ERROR_MESSAGE);
		
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new Day060805();
	}

}
