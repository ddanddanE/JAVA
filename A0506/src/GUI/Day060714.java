package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Day060714 extends JFrame{
	JTextField jf = new JTextField(20);
	JTextArea ja = new JTextArea(10,20);
	
	Day060714(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel jl = new JLabel("enter");
		c.add(jf); 
		c.add(jl); 
		c.add(new JScrollPane(ja)); 
		
		jf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField jf1 = (JTextField)e.getSource();
				ja.append(jf1.getText());
				//text area�� textfield�� ���� ���ڿ��� �߰��Ѵ�.
				jf1.setText(" ");
				//textfile�� �������� �ʱ�ȭ�Ѵ�.
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new Day060714();
	}

}
