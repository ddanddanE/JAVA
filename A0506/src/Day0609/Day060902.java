package Day0609;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
class Th extends Thread{
	JLabel j;
	public Th(JLabel j) {
		this.j=j;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			j.setText(i+"");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.exit(0);
			}
		}
	}
}
public class Day060902 extends JFrame{
	Day060902(){
			Container c=getContentPane();

	        c.setLayout(new FlowLayout());

	        JLabel j=new JLabel();

	        c.add(j);
	        
	        Th t=new Th(j);         //쓰레드객체생성

	        setVisible(true);

	        t.start();               //쓰레드실행
	}
	public static void main(String[] args) {
		new Day060902();
	}

}
