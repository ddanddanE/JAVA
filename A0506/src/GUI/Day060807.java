package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Day060807 extends JFrame{
	Day060807(){
		setTitle("다이어로그");
		Container c= getContentPane();
		c.add(new Dia(),BorderLayout.NORTH);
		setVisible(true);
	}
	
	class Dia extends Panel{
		JButton j = new JButton("이름입력");
		JButton j2 = new JButton("학인");
		JButton j3 = new JButton("메세지");
		JTextField j1 = new JTextField(10);
		Dia(){
			setBackground(Color.blue);
			add(j);
			add(j1);
			add(j2);
			add(j3);
			j.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("이름입력");
					if(name != null) {
						j1.setText(name);
					}
				}
			});
			j2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int r = JOptionPane.showConfirmDialog(null, "계속?","확인",JOptionPane.YES_NO_OPTION);
					if(r==JOptionPane.CLOSED_OPTION) {
						j1.setText("선택안했다.");
					}else if(r == JOptionPane.YES_OPTION) {
						j1.setText("네");
					}else {
						j1.setText("아니오");
					}
				}
			});
			j3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "경고","메세지",JOptionPane.WARNING_MESSAGE);
				}
			});
		}
	}
	public static void main(String[] args) {
		new Day060807();
	}

}
