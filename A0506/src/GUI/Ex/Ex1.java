package GUI.Ex;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JFrame;

public class Ex1 {

	public static void main(String[] args) {
		Frame fr = new Frame("첫 프레임");
		fr.setBounds(800,100,400,300);
		Panel p = new Panel();
		p.add(new Button("종료"));
		
		System.out.println(fr.getBounds().getWidth());
		System.out.println(fr.getBounds().getHeight());
		
		fr.setBackground(Color.blue);
		fr.setBackground(Color.BLUE);
		fr.setVisible(true);
	}

}
