package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Day060309 extends JFrame{
	Day060309(){
		super("JAVA");//제목 설정
		setSize(300,300);//프레임 크기 설정
		setVisible(true);//프레임 출력 메소드
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		
		Container c= getContentPane();
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);
		c.setLayout(new FlowLayout());
		
		c.setLayout(new FlowLayout());
		JButton j1=new JButton("ㅇㅇㅇ");
		JButton j2=new JButton("ㅇㅇ");
		c.add(j1);
		c.add(j2);
	}
	
	
	public static void main(String[] args) {
		new Day060309();
	}

}
