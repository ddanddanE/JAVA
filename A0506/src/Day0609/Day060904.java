package Day0609;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Day060904 extends JFrame{
	JButton jb = new JButton("Cal");
	JLabel jl = new JLabel("계산");
	Day060904(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jl);
		c.add(jb);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Aa a = new Aa();
				a.setVisible(true);
			}
		});
		setVisible(true);
	}
	class Aa extends JDialog{
		JTextField f1 = new JTextField(15);
		JTextField f2 = new JTextField(15);
		
		JButton jb = new JButton("ADD");
		Aa(){
			setLayout(new FlowLayout());
			add(new JLabel("두 수를 더합니다."));
			add(f1);
			add(f2);
			add(jb);
			jb.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					double d1 = Double.parseDouble(f1.getText())+Double.parseDouble(f2.getText());
					jl.setText(d1+"");
				}
			});
			
		}

	}
	public static void main(String[] args) {
		new Day060904();
	}

}
