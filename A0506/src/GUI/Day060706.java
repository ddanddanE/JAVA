package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
class Mouse1 extends MouseAdapter{
	public void mouseEntered(MouseEvent e) {
		JLabel j = (JLabel)e.getSource();
		j.setText("��Ծ�");
	}
	public void mouseExited(MouseEvent e) {
		JLabel j = (JLabel)e.getSource();
		j.setText("�ڹٴ�");
	}
}
public class Day060706 extends JFrame{
	Day060706(){
		Container c=getContentPane();
		JLabel j =new JLabel("�ڹٴ�");
		c.add(j);
		c.setLayout(new FlowLayout());
		j.addMouseListener(new Mouse1());
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Day060706();

	}

}
