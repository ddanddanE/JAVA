package Day0609;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class Number {
	static void pr(int a) {
		System.out.println(a);
	}

	void show(double d) {
		System.out.println(d);
	}
}

public class Day060905 extends JFrame {
	Day060905() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		int i = (int) ((Math.random() * 50) + 1);
		JTextArea jta = new JTextArea(1, 10);
		jta.setText(i + "");

		JButton jb1 = new JButton("+5");
		JButton jb2 = new JButton("-5");
		JButton jb3 = new JButton("/5");

		c.add(jta);
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);

		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText((Integer.parseInt(jta.getText())+5)+"");
				jb1.hide();
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText((Integer.parseInt(jta.getText())-5)+"");
				jb2.hide();
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText((Integer.parseInt(jta.getText())/5)+"");
				jb3.hide();
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		jta.setEditable(false);
		setSize(400,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		Number.pr(100);
		Number n = new Number();
		n.show(3.14);
		new Day060905();
	}
}
