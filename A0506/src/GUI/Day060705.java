package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
class Mouse extends MouseAdapter implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		Container c= (Container) e.getSource();
		c.setBackground(Color.blue);
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		//Container c= (Container) e.getSource();
		//c.setBackground(Color.red);
	}
	public void mouseReleased(MouseEvent e) {
		Container c= (Container) e.getSource();
		c.setBackground(Color.pink);
	}
	
}
public class Day060705 extends JFrame{
	Day060705(){
		Container c= getContentPane();
		c.setBackground(Color.pink);
		c.addMouseMotionListener(new Mouse());
		c.addMouseListener(new Mouse());
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Day060705();
	}

}
