package GUI;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Day060811 extends JFrame{
	Day060811(){
		Container c = getContentPane();
		JPanel j1 = new JPanel();
		JPanel j2 = new JPanel();
		JPanel j3 = new JPanel();
		
		j1.setBackground(Color.GRAY);
		j2.setLayout(new GridLayout(4,5));
		j3.setBackground(Color.LIGHT_GRAY);
		
		c.add(j1,BorderLayout.NORTH);
		c.add(j2);
		c.add(j3,BorderLayout.SOUTH);
		
		JLabel jl = new JLabel("입력");
		JTextField jf = new JTextField(10);
		
		j1.add(jl);
		j1.add(jf);
		
		j2.setBackground(Color.lightGray);
		
		for (int i = 0; i < 20; i++) {
			JButton b = new JButton();
			String s[] = {"CE","( )","%","/","7","8","9","x","4","5","6","-","1","2","3","+","+/-","0",".","계산"};
			b.setText(s[i]);
			j2.add(b);
		}
		
		
		
		
		JLabel jlunder = new JLabel("결과");
		JTextField jfunder = new JTextField(10);
		
		j3.add(jlunder);
		j3.add(jfunder);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Day060811();
	}

}
