package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class Text implements ActionListener {
	JTextArea jt;
	public Text(JTextArea jt) {
		this.jt = jt;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jt.setText("������");
		jt.append("�����Է�: ");
	}

}

public class Day060801 {

	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		
		JTextArea jt = new JTextArea(10,20);
		jt.append("�Է�");

		JButton b = new JButton("����");
		b.addActionListener(new Text(jt));
		
		j.add(b);
		j.add(jt);

		j.setVisible(true);
	}

}
